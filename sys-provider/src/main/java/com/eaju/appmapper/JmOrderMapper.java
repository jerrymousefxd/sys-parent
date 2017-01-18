package com.eaju.appmapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.eaju.pojo.JMOrder;
@Repository
public interface JmOrderMapper {
	
	int insertJmOrder(JMOrder jmOrder);
	
	int updateJmOrder(String casenumber);
	/**
	 * 返回不重复工单号
	 * @return
	 */
	List<Map<String,Object>> selectJmOrderGDH();
	/**
	 * 查重九牧订单
	 * @param jmOrder
	 * @return
	 */
	List<Map<String,Object>> selectJmOrder(String seqid);
}
