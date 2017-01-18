package com.eaju.appservice;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.eaju.entity.TbOrder;

public interface IThirdPartyMerchantService {
	/**
	 * 查询需要解析的报文
	 * @param
	 * @return
	 */
	 List<Map<String,Object>> findThirdPartyMerchant();
	 int updateThirdPartyMerchant(String id,String status);
}
