package com.eaju.service.job;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.eaju.appservice.ITbOrderService;
import com.eaju.util.DateUtils;
public class QuartzFbsOrder28182 implements Serializable {

	private static final long serialVersionUID = -7082956986101973473L;

	private final static Logger logger=LoggerFactory.getLogger(QuartzFbsOrder28182.class);
	@Autowired
	private ITbOrderService iTbOrderService;

	public void work() {
		try {
			logger.info("获取老系统Fbs单子插入新的8182,当前时间是【" + DateUtils.getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss") + "】");
			iTbOrderService.insertOrderByFindFromAppFbs("2016-11-01 00:00:00", "2016-12-01 00:00:00");
			logger.info("获取老系统Fbs单子插入新的8182成功,当前时间是【" + DateUtils.getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss") + "】");
		} catch (Exception e) {
			logger.info("获取老系统Fbs单子插入新的8182失败" +e.getStackTrace());
		}
	}
}
