package com.eaju.appmapper;

import java.util.List;

import com.eaju.entity.Product;

public interface AppProductMapper {
	
	List<Product> getProductList(String workOrderId);
	
}