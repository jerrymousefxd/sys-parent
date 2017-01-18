package com.eaju.facadeImpl;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eaju.facade.IOrderServiceRest;
import com.eaju.pojo.PageQuery;
import com.eaju.service.IOrderService;


@Service("orderServiceRest")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = com.eaju.facade.IOrderServiceRest.class,protocol = {"rest","dubbo"},retries =0)
public class OrderServiceRest implements IOrderServiceRest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(OrderServiceRest.class);
	@Autowired
	private IOrderService orderService;

	@Override
	public String getAllOrderByPage(PageQuery pq) {
		// TODO Auto-generated method stub
		return orderService.getAllOrderList(pq);
	}

	@Override
	public String getClassGroup(String param) {
		// TODO Auto-generated method stub
		return "hello"+param;
	}
	
	
	
}
