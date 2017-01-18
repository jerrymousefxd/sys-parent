package com.eaju.service.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eaju.entity.F554281;
import com.eaju.entity.F554281Example;
import com.eaju.entity.F554281Example.Criteria;
import com.eaju.mapper.F554281Mapper;
import com.eaju.service.F8182Test;
import com.eaju.service.job.QuartzFbsOrder28182;
@Component
@Transactional
public class F8182TestImpl implements F8182Test{
	private final static Logger logger=LoggerFactory.getLogger(QuartzFbsOrder28182.class);
	@Autowired
	private F554281Mapper f554281Mapper;
	@Override
	public void selectByOutOrderSn(String outOrderSn) {
		// TODO Auto-generated method stub
		//F554281 f554281 = f554281Mapper.selectByOutOrderSn(outOrderSn);
		F554281Example ex=new F554281Example();
		Criteria i = ex.createCriteria();
		i.andSovr01EqualTo(outOrderSn);
		List<F554281> selectByExample = f554281Mapper.selectByExample(ex);
		selectByExample=f554281Mapper.test(outOrderSn);
		for (F554281 f554281 : selectByExample) {
			logger.info(String.valueOf(f554281.getSovr01()));
		}
		//logger.info(String.valueOf(f554281.getSovr01()));
	}

}
