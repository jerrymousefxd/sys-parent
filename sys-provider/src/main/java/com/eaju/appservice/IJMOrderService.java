package com.eaju.appservice;

import java.util.List;

import com.eaju.entity.TbOrder;
import com.eaju.pojo.JMOrder;

public interface IJMOrderService {
	/**
	 * 批量插入订单
	 * @param Orders
	 * @return
	 */
	int insertJMOrder(List<JMOrder> Orders);
}
