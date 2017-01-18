package com.eaju.service.job;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.eaju.service.F8182Test;
import com.eaju.util.DateUtils;
public class TestJob implements Serializable {

	private static final long serialVersionUID = -7082956986101973473L;

	private final static Logger logger=LoggerFactory.getLogger(TestJob.class);
	@Autowired
	private F8182Test f8182Test;

	public void work() {
		try {
			logger.info("获取老系统Fbs,当前时间是【" + DateUtils.getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss") + "】");
			f8182Test.selectByOutOrderSn("2732453317497283");
			logger.info("获取老系统Fbs单子插入新的8182成功,当前时间是【" + DateUtils.getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss") + "】");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("获取老系统Fbs单子插入新的8182失败" +e.fillInStackTrace());
		}
	}
}
