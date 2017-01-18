package com.eaju.service.job;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.eaju.appservice.IJMOrderService;
import com.eaju.appservice.ITbOrderService;
import com.eaju.appservice.IThirdPartyMerchantService;
import com.eaju.entity.TbOrder;
import com.eaju.entity.TbOrderDetail;
import com.eaju.pojo.JMJson;
import com.eaju.pojo.JMOrder;
import com.eaju.util.DateUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import oracle.sql.CLOB;
public class QuartzAddOrder implements Serializable {

	private static final long serialVersionUID = -7082956986101973473L;

	private static final Logger logger = Logger.getLogger(QuartzAddOrder.class);
	@Autowired
	private ITbOrderService iTbOrderService;
	@Autowired
	private IThirdPartyMerchantService iThirdPartyMerchantService;
	@Autowired
	private IJMOrderService iJMOrderService;

	public void work() {
		List<Map<String,Object>> findThirdPartyMerchant=new ArrayList<Map<String,Object>>();
		try {
			logger.info(
					"解析九牧訂單,当前时间是【" + DateUtils.getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss") + "】");
			/**
			 * 报文表查询初始化状态报文 解析去重，插入订单表
			 */
			List<JMOrder> lists = new ArrayList<JMOrder>();
			Set<JMOrder> set=new HashSet<JMOrder>();
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create();
			findThirdPartyMerchant = iThirdPartyMerchantService.findThirdPartyMerchant();
			if(findThirdPartyMerchant.size()>0){
				for (Map<String, Object> map : findThirdPartyMerchant) {
					String id = map.get("id").toString();
					iThirdPartyMerchantService.updateThirdPartyMerchant(id, "2");
					CLOB clob;
					if(map.get("content") instanceof com.alibaba.druid.proxy.jdbc.ClobProxyImpl){
						clob=(CLOB) ((com.alibaba.druid.proxy.jdbc.ClobProxyImpl)map.get("content")).getRawClob();
					}else{
						clob=(CLOB)map.get("content");
					}
					String string = clobToString(clob);
					JsonObject json;
					/**
					 * 防止脏报文
					 */
					try {
						json = new JsonParser().parse(string).getAsJsonObject();
					} catch (Exception e) {
						logger.info(e.getMessage());
						continue;
					}
					//JsonElement jsonElement = json.get("data");
					JsonElement jsonElement = json.get("rows");
					String content = jsonElement.toString();
					List<JMJson> jsons = gson.fromJson(content, new TypeToken<List<JMJson>>(){}.getType());
					for (JMJson jmJson : jsons) {
						List<String> cell = jmJson.getCell();
						JMOrder order=new JMOrder();
						order.setDeliverid(cell.get(0));
						order.setCustid(cell.get(1));
						order.setCustname(cell.get(2));
						order.setMobile(cell.get(3));
						order.setPhone(cell.get(4));
						order.setMediatype(cell.get(5));
						order.setNickname(cell.get(6));
						order.setOrderid(cell.get(7));
						order.setBuytime(getDateByString(cell.get(8)));
						order.setDelivertime(getDateByString(cell.get(9)));
						order.setChannel(cell.get(10));
						order.setChannelid(cell.get(11));
						order.setShop(cell.get(12));
						order.setProvince(cell.get(13));
						order.setCity(cell.get(14));
						order.setDistrict(cell.get(15));
						order.setAddress(cell.get(16));
						order.setContactname(cell.get(17));
						order.setContactphone(cell.get(18));
						order.setReqtime(getDateByString(cell.get(19)));
						order.setSyncdt(getDateByString(cell.get(20)));
						order.setProductcode(cell.get(21));
						order.setQuantity(cell.get(22)==null?null:cell.get(22).split("\\.")[0]);
						order.setPrice(cell.get(23));
						order.setSeqid(cell.get(24));
						order.setPcount(cell.get(25));
						order.setReqnote(cell.get(26));
						order.setExpressco(cell.get(27));
						order.setExpressno(cell.get(28));
						order.setCasenumber(cell.get(29));
						order.setAssetnumber(cell.get(30));
						order.setProductname(cell.get(31));
						set.add(order);
					}
				}
				lists.addAll(set);
				iJMOrderService.insertJMOrder(lists);
				/**
				 * 封装需要的实体
				 */
				Map<String, List<JMOrder>> resultMap = new HashMap<String, List<JMOrder>>();
				for (int i = 0; i < lists.size(); i++) {
					JMOrder ord = lists.get(i);
					if (resultMap.containsKey(ord.getCasenumber())) {
						resultMap.get(ord.getCasenumber()).add(ord);
					} else {
						List<JMOrder> list = new ArrayList<JMOrder>();
						list.add(ord);
						resultMap.put(ord.getCasenumber(), list);
					}
				}
				List<TbOrder> orders=new ArrayList<TbOrder>();
				for(Map.Entry<String, List<JMOrder>> map:resultMap.entrySet()){
					String key = map.getKey();
					TbOrder tbOrder = new TbOrder();
					tbOrder.setOutOrderSn(key);
					tbOrder.setOrderType("JM");
					tbOrder.setDeleteFlag(0);
					/**
					 * 去重continue
					 */
					List<TbOrder> findTbOrder = iTbOrderService.findTbOrder(tbOrder);
					if (findTbOrder.size() > 0) {
						continue;
					}
					List<JMOrder> value = map.getValue();
					if(value.size()>0){
						JMOrder jmOrder=value.get(0);
						TbOrder order = new TbOrder();
						order.setOutOrderSn(jmOrder.getCasenumber());
						order.setMemberCode(jmOrder.getCustid());
						order.setShipName(jmOrder.getCustname());
						order.setShipMobile(jmOrder.getMobile());
						order.setOutCreateDate(jmOrder.getBuytime());
						order.setStoreName(jmOrder.getChannel());
						order.setShipAddress(jmOrder.getAddress());
						order.setDispatchMemo(jmOrder.getExpressco());
						order.setDispatchSn(jmOrder.getExpressno());
						order.setOrderType("JM");
						List<TbOrderDetail> list = order.getLists();
						for (JMOrder jmOrder2 : value) {
							TbOrderDetail detail = new TbOrderDetail();
							detail.setOrderType("JM");
							detail.setOutProductSn(jmOrder2.getProductcode());
							detail.setProductName(jmOrder2.getProductname());
							detail.setSalesPrice(jmOrder2.getPrice()==null?null:new BigDecimal(jmOrder2.getPrice()));
							detail.setProductQuantity(jmOrder2.getQuantity()==null?null:Integer.valueOf(jmOrder2.getQuantity()));
							list.add(detail);
						}
						orders.add(order);
					}
				}
				if(orders.size()>0){
					iTbOrderService.insertTbOrder(orders);
				}
				for (Map<String, Object> map : findThirdPartyMerchant) {
					String id = map.get("id").toString();
					iThirdPartyMerchantService.updateThirdPartyMerchant(id, "3");
				}
			}
			logger.info("解析九牧訂單成功,当前时间是【" + DateUtils.getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss") + "】");
		} catch (Exception e) {
			/**
			 * 设置报文解析失败
			 */
			for (Map<String, Object> map : findThirdPartyMerchant) {
				String id = map.get("id").toString();
				iThirdPartyMerchantService.updateThirdPartyMerchant(id, "4");
			}
			logger.info("解析九牧訂單失敗,当前时间是【" + DateUtils.getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss")
					+ "】" + "解析九牧訂單失敗原因：" + e.getMessage());
		}
	}
	private String clobToString(CLOB clob) throws IOException, SQLException{
		Reader is = clob.getCharacterStream();
		BufferedReader br = new BufferedReader(is); 
		String s = br.readLine(); 
		StringBuffer sb = new StringBuffer(); 
		while (s != null) {
			sb.append(s); 
			s = br.readLine(); 
		} 
		return sb.toString(); 
	}
	private static Date getDateByString(String date) throws Exception{
		if(StringUtils.isBlank(date))return null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		date = date.replaceAll("T", " ");
		return sdf.parse(date);
	}
}
