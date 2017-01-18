package com.eaju.appservice.serviceimpl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eaju.appmapper.F554281MapperApp;
import com.eaju.appmapper.F554282MapperApp;
import com.eaju.appmapper.TbOrderDetailMapper;
import com.eaju.appmapper.TbOrderMapper;
import com.eaju.appmapper.TimestampTableMapper;
import com.eaju.appmapper.ToomsMapper;
import com.eaju.appservice.ITbOrderService;
import com.eaju.entity.F554281;
import com.eaju.entity.F554281Example;
import com.eaju.entity.F554281Example.Criteria;
import com.eaju.entity.F554282;
import com.eaju.entity.TbOrder;
import com.eaju.entity.TbOrderDetail;
import com.eaju.entity.TimestampTable;
import com.eaju.entity.TimestampTableExample;
import com.eaju.entity.ToomsExample;
import com.eaju.mapper.F554281Mapper;
import com.eaju.mapper.F554282Mapper;
import com.eaju.util.ResourcesUtil;

@Component
@Transactional
public class TbOrderServiceImpl implements ITbOrderService {
	/**
	 * Logger for this class
	 */
	private final static Logger logger=LoggerFactory.getLogger(TbOrderServiceImpl.class);
	@Autowired
	private TbOrderMapper orderMapper;
	@Autowired
	private F554281Mapper f554281Mapper;
	@Autowired
	private F554282Mapper f554282Mapper;
	@Autowired
	private F554281MapperApp f554281MapperApp;
	@Autowired
	private F554282MapperApp f554282MapperApp;
	@Autowired
	private TbOrderDetailMapper tbOrderDetailMapper;
	@Autowired
	private TimestampTableMapper timestampTableMapper;
	@Autowired
	private ToomsMapper toomsMapper;
	
	@Override
	public int insertTbOrder(List<TbOrder> tbOrders) {
		try {
			int num=0;
			for (TbOrder tbOrder : tbOrders) {
				TbOrder order = new TbOrder();
				order.setOutOrderSn(tbOrder.getOutOrderSn());
				if(orderMapper.selectTbOrder(order).size()>0)
					break;
				String fid = UUID.randomUUID().toString().replaceAll("\\-","");
				tbOrder.setFid(fid);
				List<TbOrderDetail> lists = tbOrder.getLists();
				for (TbOrderDetail tbOrderDetail : lists) {
					tbOrderDetail.setFid(UUID.randomUUID().toString().replaceAll("\\-",""));
					tbOrderDetail.setOrderId(fid);
					tbOrderDetailMapper.insertTbOrderDetail(tbOrderDetail);
				}
				num+= orderMapper.insertTbOrder(tbOrder);
			}
			return num;
		} catch (Exception e) {
			return 0;
		}
	}

@Override
public List<TbOrder> findTbOrder(TbOrder tbOrder) {
	// TODO Auto-generated method stub
	return orderMapper.selectTbOrder(tbOrder);
}

@Override
public void insertOrderByFindFromAppFbs(String beginTime, String endTime) {
	try{
		logger.info(beginTime+" "+endTime);
		String date = getTimeStamp();
		List<TbOrder> tbs = orderMapper.selectTbOrderFBSByTime(ResourcesUtil.getValue("http", "FbsAppOrderTime"), date);
		List<TbOrder> tbss=new ArrayList<TbOrder>();
		List<F554281> list=new ArrayList<F554281>();
		List<F554281> lists=new ArrayList<F554281>();
		//fbs查詢
		for (TbOrder tbOrder : tbs) {
			//不存在
			//int count = orderMapper.selectFbsByTbOrderFid(tbOrder.getFid());
			F554281 f81 = f554281MapperApp.selectByOrderSn(tbOrder.getOrderSn());
			logger.info(String.valueOf(f81.getSodoco()));
			if(f81!=null){
				//老系统查出的重复外部订单号处理
				int flag=0;
				for (F554281 f554281 : list) {
					//if(String.valueOf(f554281.getSovr01()).equals(String.valueOf(f81.getSovr01())))flag=1;
					if(f554281.getSodoco().compareTo(f81.getSodoco())==0)flag=1;
				}
				if(flag==0){
					list.add(f81);
					tbss.add(tbOrder);
				}
			}
			//存在
			continue;
		}
		//新8182查詢
		tbs.clear();
		for (TbOrder tbOrder : tbss) {//tbss
			//存在
			F554281Example example = new F554281Example();
			Criteria criteria = example.createCriteria();
			criteria.andSodocoEqualTo(new BigDecimal(tbOrder.getOrderSn()));//tbOrder.getOrderSn()
			int count = f554281Mapper.countByExample(example);
			if(count>0){//list.add(tbOrder);
				tbs.add(tbOrder);//tbs
			}else{//不存在
//				F554281 f=new F554281();
//				f.setSodoco(new BigDecimal(1.0));
//				list.add(f);
				for (F554281 f554281 : list) {
					if(tbOrder.getOrderSn().compareTo(f554281.getSodoco().intValue())==0){//tbOrder.getOrderSn()
						lists.add(f554281);
						break;
					}
				}
			}
		}
		tbss.removeAll(tbs);
		
		for (F554281 f554281 : lists) {
			List<F554282> f82s = f554282MapperApp.selectByOrderId(String.valueOf(f554281.getOrderId()).trim());
			f554281Mapper.insert(f554281);
			for (F554282 f554282 : f82s) {
				f554282.setSdn001(f554281.getSon001());
				f554282Mapper.insert(f554282);
			}
			orderMapper.updateTbOrderByFid(String.valueOf(f554281.getSovr01()).trim());
			//记录下写入8182的工单 已处理工单信息
			ToomsExample exa=new ToomsExample();
			com.eaju.entity.ToomsExample.Criteria cc = exa.createCriteria();
			cc.andOrdersnEqualTo(f554281.getSodoco());
			int count = toomsMapper.countByExample(exa);
			if(count>0)continue;
			toomsMapper.insertToOms(f554281.getSodoco().intValue(),String.valueOf(f554281.getSovr01()).trim());
			
		}
		//tbs.removeAll(list);
//		for (TbOrder tbOrder : list) {
//			List<TbOrderDetail> details = tbOrderDetailMapper.findTbOrderDetailByOrderFid(tbOrder.getFid());
//			tbOrder.setLists(details);
//			F554281 f81=convertTBtoF81(tbOrder);
//			//写8182
//			f554281Mapper.insert(f81);
//			List<F554282> f554282 = f81.getF554282();
//			for (F554282 f5542822 : f554282) {
//				f554282Mapper.insert(f5542822);
//			}
//			//设置删除
//			orderMapper.updateTbOrderByFid(tbOrder.getFid());
//		}
		//记录下写入8182的工单 已处理工单信息
		
	}catch(Exception e){
		e.printStackTrace();
		logger.info("老app中fbs订单写入8182失败："+e.getMessage());
	}
	
}

private String getTimeStamp() throws Exception {
	TimestampTableExample exa1=new TimestampTableExample();
	com.eaju.entity.TimestampTableExample.Criteria criteria2 = exa1.createCriteria();
	criteria2.andTypeEqualTo("1");
	List<TimestampTable> selectByExample = timestampTableMapper.selectByExample(exa1);
	Date date = selectByExample.get(0).getTimestampDate();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	if(date==null){
		sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date parse = sdf.parse(ResourcesUtil.getValue("http", "FbsAppOrderTime"));
		long time = parse.getTime()+Integer.valueOf(ResourcesUtil.getValue("http", "FbsAppOrderTimePeriod"))*24*60*60*1000l;
		date=new Date(time);
	}
	String format = sdf.format(date);
	selectByExample.get(0).setTimestampDate(new Date(date.getTime()+Integer.valueOf(ResourcesUtil.getValue("http", "FbsAppOrderTimePeriod"))*24*60*60*1000l));
	timestampTableMapper.updateByExample(selectByExample.get(0), exa1);
	return format;
}
private F554281 convertTBtoF81(TbOrder t){
	F554281 f=new F554281();
	f.setSodoco(new BigDecimal(t.getOrderSn()));
	f.setSokcoo(t.getStoreId());
	f.setSocpn1(t.getStoreName());
	f.setSovr01(t.getOutOrderSn());
	//订单来源代码 01 待确认
	f.setSo55ly("01");
	f.setSodl01(t.getOutOrderSn().startsWith("t")?"天猫":t.getOutOrderSn().startsWith("j")?"京东":t.getOutOrderSn().startsWith("v")?"唯品会":null);
	//订单类型
	f.setSodcto(t.getOrderType());
	//待定 说明2 Sales Order
	f.setSodl02("Sales Order");
	//待定
	f.setSodrqj(1);
	f.setSodl24("无限制");
	f.setSodc(t.getStoreName());
	//服务类型 待定
	f.setSostye("");
	//是否指定承运商 0或者1 待定
	f.setSotypt(0);
	//承运商代码 待定
	f.setSo55cy("");
	//承运商名称
	f.setSoalph3(t.getDispatchMemo());
	//父号 待定
	f.setSoaaid(null);
	//取消原因
	f.setSodl03(null);
	//是否取消 待确认01还是02
	f.setSotpur("02");
	//是否需要发票
	f.setSoa(0);
	f.setSoalph(t.getShipName());
	f.setSoph1(t.getShipMobile());
	f.setSoadd1(t.getShipAddress());
	f.setSofil2(t.getMemo2());
	//是否需要代收货款 待定 0不需要 1需要
	f.setSoa105(0);
	//待收货款金额
	f.setSoaa(new BigDecimal(0));
	//总金额
	f.setSoaexp(new BigDecimal(t.getTotalProductPrice()));
	//是否结算 待确定
	f.setSoa106(1);
	//编号1 待确定
	f.setSon001(null);
	//编号2 待确定
	f.setSon002(null);
	//标识
	f.setSosrs2(null);
	//描述
	f.setSomgtx(null);
	//备注
	f.setSod200(null);
	for ( TbOrderDetail d : t.getLists()) {
		F554282 fd=new F554282();
		//商品编号
		fd.setSdlitm(d.getOutProductSn());
		fd.setSddsc1(d.getProductName());
		fd.setSduorg(new BigDecimal(d.getAmount()));
		//体积
		fd.setSditvl(null);
		//重量
		fd.setSditwt(null);
		//批次
		fd.setSdlocn(null);
		//商品状态
		fd.setSdlocn(null);
		//品牌
		fd.setSddl01(null);
		//商品类型代码
		fd.setSdprp1(null);
		//商品类型名称
		fd.setSddl02(null);
		//件型	EOOI_SIZE_TYPE	空	VARCHAR2(32)	F554282	SDDL03
		fd.setSddl03(null);
		//是否赠品	EOOI_IS_GIFT	必输	VARCHAR2(32)	F554282	SDDL04
		fd.setSddl04(null);
		//销售单价	EOOI_PRICE	空	NUMBER(18,8)	F554282	SDUPRC
		fd.setSduprc(d.getSalesPrice());
		//优惠金额	EOOI_PREFERENTIAL_PRICE	空	NUMBER(18,8)	F554282	SDAA1
		fd.setSdaa1(null);
		//发货仓库编码	EOOI_WAREHOUSER_CODE	空	VARCHAR2(36)	F554282	SDMCU
		fd.setSdmcu(t.getWarehouseId());
		//发货仓库名称	EOOI_WAREHOUSER_NAME	空	VARCHAR2(256)	F554282	SDDC
		fd.setSddc(t.getWarehouseName());
		//收货仓库编码	EOOI_CONSIGNEE_WAREHOUSER_CODE	空	VARCHAR2(40)	F554282	SDMCU3
		fd.setSdmcu3(null);
		//收货仓库名称	EOOI_CONSIGNEE_WAREHOUSER_NAME	空	VARCHAR2(100)	F554282	SDDC20
		fd.setSddc20(null);
		//行号	EOOI_LINK_PM_CODE		VARCHAR2(36)	F554282	SDLNID
		fd.setSdlnid(new BigDecimal(d.getLineNo()));
		//批次号	EOOI_UP_LOT_REMARK		VARCHAR2(256)	F554282	SDLOTN
		fd.setSdlotn(null);
		//备注	EOOI_REMARK		VARCHAR2(512)	F554282	SDVR01
		fd.setSdvr01(null);
		//明细行取消标识	EOOI_CANCLE_FLAG		VARCHAR2(32)	F554282	SDDL20
		fd.setSddl20(null);
		//明细行取消失败描述	EOOI_CANCLE_REMARK		VARCHAR2(512)	F554282	SDREMK
		fd.setSdremk(null);
		//销售单号	EOOI_LOGISTIC_NO		VARCHAR2(32)	F554282	SDDOCO
		fd.setSddoco(new BigDecimal(t.getOrderSn()));
		//公司	EOOI_COMPANY_NO		VARCHAR2(32)	F554282	SDKCOO
		fd.setSdkcoo(t.getStoreId());
		//单据类型	EOOI_ORDER_TYPE_CODE		VARCHAR2(32)	F554282	SDDCTO
		fd.setSddcto(t.getOrderType());
		//服务单号（edi中间表唯一）	EOOI_UPSYS_NO		VARCHAR2(32)	F554282	SDN001
		fd.setSdn001(null);
		//原服务单号				F554282	SDN002
		fd.setSdn002(null);
		f.getF554282().add(fd);
	}
	
	return f;
	
}
}
