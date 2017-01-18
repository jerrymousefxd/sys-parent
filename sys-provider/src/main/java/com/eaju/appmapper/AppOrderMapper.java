package com.eaju.appmapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.eaju.entity.AllOrder;
import com.eaju.entity.BosWorkOrders;

public interface AppOrderMapper {
	/**
	 * 根据工单号查询单子
	 * @param outId
	 * @return
	 */
	List<AllOrder> findOrderByPrimary(String outId);
	/**
	 * 查询时间段内工单信息
	 * @param begin
	 * @param end
	 * @return
	 */
	List<BosWorkOrders> findAppOrderByTime(@Param("begin") String begin,@Param("end") String end);
}