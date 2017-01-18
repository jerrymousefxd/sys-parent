package com.eaju.appmapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ThirdPartyMerchantMapper {
	/**
	 * 查询需要解析报文
	 * @return
	 */
    List<Map<String,Object>> selectThirdPartyMerchant();
    /**
     * 修改需要解析报文
     */
    int updateThirdPartyMerchant(@Param("id") String id,@Param("status") String status);
}