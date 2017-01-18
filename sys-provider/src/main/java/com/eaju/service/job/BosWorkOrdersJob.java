package com.eaju.service.job;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.eaju.service.IBosWorkOrdersService;
/**
 * 同步app-oms工单到新表
* <p>Title: BosWorkOrdersJob</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author admin
* @date 2016年12月8日
 */
public class BosWorkOrdersJob implements Serializable{

	private static final long serialVersionUID = -6605926162597785791L;

	@Autowired
	public IBosWorkOrdersService  iBosWorkOrdersService;
	public void  work(){
		iBosWorkOrdersService.insertBosWorkOrders();
	}
}
