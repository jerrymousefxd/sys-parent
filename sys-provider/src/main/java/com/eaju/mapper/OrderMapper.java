package com.eaju.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.eaju.entity.AllOrder;
import com.eaju.entity.BosWorkOrders;
import com.eaju.pojo.OrderPojo;
/**
 * 
* <p>Title: OrderMapper</p>
* <p>Description: </p>
* <p>Company: 蚁安居</p> 
* <p>Mail: jerrymousefxd@163.com</p> 
* @author 付兴东
* @date 2016年12月30日
 */
public interface OrderMapper {
	
	/**
	 * app-oms
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> getAllOrderList(Map<String,Object> params);
	
	/**
	 * 根据主键查询工单信息
	 * @param params
	 * @return
	 */
	List<AllOrder> getOrderByPrimary(String outId);
	/**
	 * app-oms 单子数量
	 * @param params
	 * @return
	 */
	int getAllOrderCount(Map<String,Object> params);
	/**
	 * 查询某个时间段内进入oms的工单
	 * @param begin
	 * @param end
	 * @return
	 */
	List<BosWorkOrders> getOmsOrderByTime(@Param("begin")String begin, @Param("end")String end);
	/**
	 * 订单插入edi中间表
	 * @param order
	 * @return
	 */
	int insertMidOrder(OrderPojo order);
	/**
	 * 查询edi中间表数据
	 * @param orderPojo
	 * @return
	 */
	List<OrderPojo> selectMidOrder(OrderPojo orderPojo);
	
	
}