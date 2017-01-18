package com.eaju.entity;

public class Product {

	/**
	 * 订单号
	 */
	private String ethiNo;
	
	/**
	 * 商品名称
	 */
	private String ethiName;
	
	/**
	 * 件数
	 */
	private String ethiQuantity;
	
	/**
	 * 安装品类
	 */
	private String comGroupName;
	
	/**
	 * 品牌
	 */
	private String brand;

	public String getEthiNo() {
		return ethiNo;
	}

	public void setEthiNo(String ethiNo) {
		this.ethiNo = ethiNo;
	}

	public String getEthiName() {
		return ethiName;
	}

	public void setEthiName(String ethiName) {
		this.ethiName = ethiName;
	}

	public String getEthiQuantity() {
		return ethiQuantity;
	}

	public void setEthiQuantity(String ethiQuantity) {
		this.ethiQuantity = ethiQuantity;
	}

	public String getComGroupName() {
		return comGroupName;
	}

	public void setComGroupName(String comGroupName) {
		this.comGroupName = comGroupName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
