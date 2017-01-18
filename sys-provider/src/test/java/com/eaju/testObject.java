package com.eaju;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.eaju.entity.F554281;
import com.eaju.entity.F554281Example;
import com.eaju.entity.F554281Example.Criteria;
import com.eaju.mapper.F554281Mapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-mybatis.xml")
public class testObject {
	/*@Autowired
	private F554281Mapper f554281Mapper;*/
	@Test
	public void test1() {
		System.out.println(123);
//		F554281Example example = new F554281Example();
//		Criteria criteria = new F554281Example().createCriteria();
//		criteria.andSovr01EqualTo("");
//		List<F554281> selectByExample = f554281Mapper.selectByExample(example);
	}
}
