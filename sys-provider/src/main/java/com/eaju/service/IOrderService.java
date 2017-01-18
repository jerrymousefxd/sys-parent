package com.eaju.service;

import com.eaju.pojo.PageQuery;

public interface IOrderService {
	
	/**
	 * app-oms 工单
	 * @param pq
	 * @return
	 */
	String getAllOrderList(PageQuery pq);
	
	
}
