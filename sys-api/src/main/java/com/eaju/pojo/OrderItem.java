package com.eaju.pojo;


/**
 * 订单商品
 * @author yianju
 *
 */
public class OrderItem {
	/**
	 * id
	 */
	private String bid;
	
	/**
	 * 商品销售单号
	 */
	private String bizGoodsSn;
	/**
	 * 订单号
	 */
    private String orderBid;
    /**
     * 商品编号
     */
    private String sn;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 一级分类
     */
    private String type01;
    /**
     * 二级分类
     */
    private String type02;
    /**
     * 三级分类
     */
    private String type03;
    
    /**
     * 品牌
     */
    private String brand;
    /**
     * 长度
     */
    private String length;
    /**
     * 高度
     */
    private String height;
    /**
     * 服务单价
     */
    private Double servicePrice;
    /**
     * 数量
     */
    private Integer amount;
    /**
     * 小计金额
     */
    private Double total;
    /**
     * 应付金额
     */
    private Double payable;
    
    /**
	 * 任务单号
	 */
	private String upsysNo;
	/**
	 * 客户订单号
	 */
	private String  logisticNo;
	
	private String proClaName;
	    
	private String proClaCode;
    
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBizGoodsSn() {
		return bizGoodsSn;
	}
	public void setBizGoodsSn(String bizGoodsSn) {
		this.bizGoodsSn = bizGoodsSn;
	}
	public String getOrderBid() {
		return orderBid;
	}
	public void setOrderBid(String orderBid) {
		this.orderBid = orderBid;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType01() {
		return type01;
	}
	public void setType01(String type01) {
		this.type01 = type01;
	}
	public String getType02() {
		return type02;
	}
	public void setType02(String type02) {
		this.type02 = type02;
	}
	public String getType03() {
		return type03;
	}
	public void setType03(String type03) {
		this.type03 = type03;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public Double getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(Double servicePrice) {
		this.servicePrice = servicePrice;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getPayable() {
		return payable;
	}
	public void setPayable(Double payable) {
		this.payable = payable;
	}
	
	public String getUpsysNo() {
		return upsysNo;
	}
	public void setUpsysNo(String upsysNo) {
		this.upsysNo = upsysNo;
	}
	public String getLogisticNo() {
		return logisticNo;
	}
	public void setLogisticNo(String logisticNo) {
		this.logisticNo = logisticNo;
	}
	public String getProClaName() {
		return proClaName;
	}
	public void setProClaName(String proClaName) {
		this.proClaName = proClaName;
	}
	public String getProClaCode() {
		return proClaCode;
	}
	public void setProClaCode(String proClaCode) {
		this.proClaCode = proClaCode;
	}
	
}
