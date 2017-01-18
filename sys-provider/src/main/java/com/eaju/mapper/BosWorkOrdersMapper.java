package com.eaju.mapper;

import org.apache.ibatis.annotations.Param;

import com.eaju.entity.BosWorkOrders;

public interface BosWorkOrdersMapper {
	
	int findBosWorkOrdersBySourceAndId(@Param("source")String source,@Param("outId")String outId);
	
	int insert(BosWorkOrders record);
}