package com.eaju.service.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eaju.appmapper.AppOrderMapper;
import com.eaju.appmapper.AppProductMapper;
import com.eaju.entity.AllOrder;
import com.eaju.entity.Product;
import com.eaju.mapper.OrderMapper;
import com.eaju.mapper.ProductMapper;
import com.eaju.pojo.PageBean;
import com.eaju.pojo.PageQuery;
import com.eaju.service.IOrderService;
import com.google.gson.Gson;

@Service
public class OrderServiceImpl implements IOrderService {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(OrderServiceImpl.class);
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private AppProductMapper appProductMapper;
	
	@Autowired
	private AppOrderMapper appOrderMapper;
	


	/**
	 * 新工单查询
	 */
	@Override
	public String getAllOrderList(PageQuery pq) {
		logger.info("入参:"+pq.getCurrentPage());
		Gson g = new Gson();
		String result = "";
		PageBean<AllOrder> pb  = new PageBean<AllOrder>();
		Map<String,Object> params = new HashMap<String,Object>();
		int curPage = pq.getCurrentPage() < 1 ? 1:pq.getCurrentPage();
		params.put("start", ((curPage -1) * pq.getPageSize()));
		params.put("end", pq.getPageSize() * curPage);
		logger.info("start:"+((curPage -1) * pq.getPageSize())+",end:"+pq.getPageSize() * curPage);
		logger.info("关键词："+pq.getKeyWord());
		logger.info("来源："+pq.getSource());
		if(StringUtils.isNotEmpty(pq.getKeyWord())){
			params.put("keyWord", pq.getKeyWord());
		}
		if(StringUtils.isNotEmpty(pq.getSource())){
			params.put("source", pq.getSource());
		}
		//20161228
		if(StringUtils.isNotEmpty(pq.getCode())){
			String[] split = pq.getCode().split(",");
			params.put("code", split);
		}
		if(StringUtils.isNotEmpty(pq.getName())){
			String[] split = pq.getName().split(",");
			params.put("name", split);
		}
		//20161228
		try {
			List<AllOrder> orderList = new ArrayList<AllOrder>();
			List<Map<String, Object>> bosList = orderMapper.getAllOrderList(params);
			for (Map<String, Object> map : bosList) {
				String string = map.get("source").toString();
				if ("oms".equals(string)) {
					List<AllOrder> list = orderMapper.getOrderByPrimary(map.get("outId").toString());
					for (AllOrder allOrder : list) {
						if("通用技师".equals(allOrder.getSupName())){
							allOrder.setSupName(null);
						}
						List<Product> proList = productMapper.getProductList(allOrder.getEon());
						allOrder.setOrderItem(proList);
					}
					orderList.addAll(list);
				} else {
					List<AllOrder> findOrderByPrimary = appOrderMapper.findOrderByPrimary(map.get("outId").toString());
					for (AllOrder allOrder : findOrderByPrimary) {
						List<Product> productList = appProductMapper.getProductList(map.get("outId").toString());
						allOrder.setOrderItem(productList);
					}
					orderList.addAll(findOrderByPrimary);
				}
			}
//			for (AllOrder order : orderList) {
//				List<Product> proList = productMapper.getProductList(order.getEon());
//				order.setOrderItem(proList);
//			}
			int recordCount = orderMapper.getAllOrderCount(params);
			logger.info("总数是:" + recordCount);
			pb = new PageBean<AllOrder>(curPage, pq.getPageSize(), orderList, recordCount);
			pb.setReturnCode("200");
			pb.setInfo("查询记录成功");
			result = g.toJson(pb);
		} catch (Exception e) {
			pb.setReturnCode("500");
			pb.setInfo(e.getMessage());
			logger.info(e);
		}
		logger.info(result);
		return result;
	}



}
