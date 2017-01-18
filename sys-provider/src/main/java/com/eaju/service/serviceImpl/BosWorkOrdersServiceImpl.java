package com.eaju.service.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eaju.appmapper.AppOrderMapper;
import com.eaju.entity.BosWorkOrders;
import com.eaju.mapper.BosWorkOrdersMapper;
import com.eaju.mapper.OrderMapper;
import com.eaju.service.IBosWorkOrdersService;
import com.eaju.util.BosWorkOrderCallable;
/**
 * 
* <p>Title: BosWorkOrdersServiceImpl</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author admin
* @date 2016年12月8日
 */
@Service
public class BosWorkOrdersServiceImpl implements IBosWorkOrdersService {
    private final static Logger logger=LoggerFactory.getLogger(BosWorkOrdersServiceImpl.class);
    
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private AppOrderMapper appOrderMapper;
    @Autowired
    private BosWorkOrdersMapper bosWorkOrdersMapper;
    /**
     * BosWorkOrders定时添加工单
     */
	@Override
	public int insertBosWorkOrders() {
		logger.info("接口处理，处理同步app-oms工单信息");
		long start=System.currentTimeMillis();
		String beginTime = "2016-12-01 00:00:00";//getBeginTime();
		String endTime = "2016-12-15 00:00:00";//getEndTime();
		final List<BosWorkOrders> omsOrder = orderMapper.getOmsOrderByTime(beginTime,endTime );
		List<BosWorkOrders> appOrder = appOrderMapper.findAppOrderByTime(beginTime, endTime);
		omsOrder.addAll(appOrder);
		int allcount = 0;
		@SuppressWarnings("rawtypes")
		List<Future> list=new ArrayList<Future>();
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(omsOrder.size()/500+1);
		for (int i=0;i<omsOrder.size()/500+1;i++) {
			BosWorkOrderCallable callable = new BosWorkOrderCallable(omsOrder.subList(i*500, 500*(i+1)>omsOrder.size()?omsOrder.size():500*(i+1)));
			callable.setBosWorkOrdersMapper(bosWorkOrdersMapper);
			Future<Integer> submit = fixedThreadPool.submit(callable);
			list.add(submit);
		}
		fixedThreadPool.shutdown();  
		for (Future<Integer> future : list) {
			try {
				allcount+=future.get();
			} catch (Exception e) {
			}
		}
//		for (BosWorkOrders bosWorkOrders : omsOrder) {
//			int count = bosWorkOrdersMapper.findBosWorkOrdersBySourceAndId(bosWorkOrders.getSource(), bosWorkOrders.getOutId());
//			if(count==0){
//				int insert = bosWorkOrdersMapper.insert(bosWorkOrders);
//				allcount+=insert;
//			}
//		}
		long end=System.currentTimeMillis();
		logger.info("同步app-oms工单信息时间：【{}】秒,共【{}】条",(end-start)/1000,allcount);
		return allcount;
	}
	private static String getTime(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date(System.currentTimeMillis()));
	}
	private static String getBeginTime(){
		StringBuilder sb=new StringBuilder(getTime());
		return sb.append(" 00:00:00").toString();
	}
	private static String getEndTime(){
		StringBuilder sb=new StringBuilder(getTime());
		return sb.append(" 23:59:59").toString();
	}
}
