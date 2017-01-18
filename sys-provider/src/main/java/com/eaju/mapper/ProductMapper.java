package com.eaju.mapper;

import java.util.List;

import com.eaju.entity.Product;
/**
 * 
* <p>Title: ProductMapper</p>
* <p>Description: </p>
* <p>Company: 蚁安居</p> 
* <p>Mail: jerrymousefxd@163.com</p> 
* @author 付兴东
* @date 2016年12月30日
 */
public interface ProductMapper {
	/**
	 * 获取商品明细
	 * @param eoNo
	 * @return
	 */
	List<Product> getProductList(String eoNo);
	
}