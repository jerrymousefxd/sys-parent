package com.eaju.appservice.serviceimpl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eaju.appmapper.ThirdPartyMerchantMapper;
import com.eaju.appservice.IThirdPartyMerchantService;

@Component
public class ThirdPartyMerchantServiceImpl implements IThirdPartyMerchantService {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(ThirdPartyMerchantServiceImpl.class);
	@Autowired
	private ThirdPartyMerchantMapper thirdPartyMerchantMapper;
	@Override
	public List<Map<String, Object>> findThirdPartyMerchant() {
		// TODO Auto-generated method stub
		return thirdPartyMerchantMapper.selectThirdPartyMerchant();
	}
	@Override
	public int updateThirdPartyMerchant(String id, String status) {
		// TODO Auto-generated method stub
		return thirdPartyMerchantMapper.updateThirdPartyMerchant(id, status);
	}
	
}
