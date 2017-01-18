package com.eaju.appservice;

import java.util.List;

import com.eaju.entity.TbOrder;

public interface ITbOrderService {
	/**
	 * 批量插入订单
	 * @param tbOrder
	 * @return
	 */
	int insertTbOrder(List<TbOrder> tbOrders);
	
	List<TbOrder> findTbOrder(TbOrder tbOrder);
	
	/**
	 * 老系统app中fbs单子写入8182定时器调用
	 * @return 
	 */
	void insertOrderByFindFromAppFbs(String beginTime,String endTime);
}
