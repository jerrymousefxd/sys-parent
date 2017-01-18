package com.eaju.appservice.serviceimpl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eaju.appmapper.JmOrderMapper;
import com.eaju.appservice.IJMOrderService;
import com.eaju.pojo.JMOrder;

@Component
public class JMOrderServiceImpl implements IJMOrderService {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(JMOrderServiceImpl.class);
	@Autowired
	private JmOrderMapper jmOrderMapper;
	
	@Override
	public int insertJMOrder(List<JMOrder> Orders) {
		int insertJmOrder=0;
		for (JMOrder jmOrder : Orders) {
			List<Map<String,Object>> selectJmOrder = jmOrderMapper.selectJmOrder(jmOrder.getSeqid());
			Integer of = Integer.valueOf(selectJmOrder.get(0).get("COUNT").toString());
			if(of>0)continue;
			insertJmOrder += jmOrderMapper.insertJmOrder(jmOrder);
		}
		return insertJmOrder;
	}
}
