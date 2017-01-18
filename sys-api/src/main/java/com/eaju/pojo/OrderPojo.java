package com.eaju.pojo;

import java.util.List;

/**
 * 订单
 * @author yianju
 *
 */
public class OrderPojo {
	

	/**
	 * 报文id
	 */
	private String transactionId;
	/**
	 * 发送方code
	 */
	private String senderId;
	/**
	 * 接收方
	 */
	private String receiverId;
	/**
	 * 接口报文发送时间
	 */
	private String timeStamp;
	/**
	 * 版本号
	 */
	private String version;
	/**
	 * 任务单号 服务单号 四位随机数
	 */
	private String upsysNo;
	/**
	 * 客户订单号
	 */
	private String  logisticNo;
	/**
	 * 客户编码
	 */
	private String  customerCode;
	
	/**
	 * 客户名称
	 */
	private String customerName;
	
	/**
	 * 订单类型编码-04
	 */
	private String orderTypeCode;
	/**
	 * 订单类型名称-安装
	 */
	private String orderTypeName;
	
	/**
	 * 服务类型-00
	 */
    private String	 delierySetupType;
    
    /**
     * 收货人名称
     */
    private String consigneeName;
    
    /**
     * 收货人手机
     */
    private String consigneePhone;
    /**
     * 收货人电话
     */
    private String consigneeTel;
    /**
     * 收货人省
     */
    private String consigneeProvince;
    
    /**
     * 收货人市
     */
    private String consigneeCity;
    /**
     * 收货人区县名称
     */
    private String consigneeDistrictName;
    
    /**
     * 收货人详细地址
     */
    private String consigneeLocationName;
    
    /**
     * 备注
     */
    private String remark;
    
    /**
     * 平台名称
     */
    private String siteName;
    
    /**
     * 平台code
     */
    private String siteCode;

    /**
     * 发货联系人
     */
    private String eoorShipperContactName;    
    
    /**
     * 发货联系人手机
     */
    private String eoorShipperContactPhone; 
    
    /**
     * 分公司编码
     */
    private String companyCode;
    
    /**
     * 分公司名称
     */
    private String companyName;
    
    private List<OrderItem> orderItem;
    
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLogisticNo() {
		return logisticNo;
	}

	public void setLogisticNo(String logisticNo) {
		this.logisticNo = logisticNo;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderTypeCode() {
		return orderTypeCode;
	}

	public void setOrderTypeCode(String orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public String getOrderTypeName() {
		return orderTypeName;
	}

	public void setOrderTypeName(String orderTypeName) {
		this.orderTypeName = orderTypeName;
	}

	public String getDelierySetupType() {
		return delierySetupType;
	}

	public void setDelierySetupType(String delierySetupType) {
		this.delierySetupType = delierySetupType;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getConsigneePhone() {
		return consigneePhone;
	}

	public void setConsigneePhone(String consigneePhone) {
		this.consigneePhone = consigneePhone;
	}

	public String getConsigneeTel() {
		return consigneeTel;
	}

	public void setConsigneeTel(String consigneeTel) {
		this.consigneeTel = consigneeTel;
	}

	public String getConsigneeProvince() {
		return consigneeProvince;
	}

	public void setConsigneeProvince(String consigneeProvince) {
		this.consigneeProvince = consigneeProvince;
	}

	public String getConsigneeCity() {
		return consigneeCity;
	}

	public void setConsigneeCity(String consigneeCity) {
		this.consigneeCity = consigneeCity;
	}

	public String getConsigneeDistrictName() {
		return consigneeDistrictName;
	}

	public void setConsigneeDistrictName(String consigneeDistrictName) {
		this.consigneeDistrictName = consigneeDistrictName;
	}

	public String getConsigneeLocationName() {
		return consigneeLocationName;
	}

	public void setConsigneeLocationName(String consigneeLocationName) {
		this.consigneeLocationName = consigneeLocationName;
	}
	
	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUpsysNo() {
		return upsysNo;
	}

	public void setUpsysNo(String upsysNo) {
		this.upsysNo = upsysNo;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public String getEoorShipperContactName() {
		return eoorShipperContactName;
	}

	public void setEoorShipperContactName(String eoorShipperContactName) {
		this.eoorShipperContactName = eoorShipperContactName;
	}

	public String getEoorShipperContactPhone() {
		return eoorShipperContactPhone;
	}

	public void setEoorShipperContactPhone(String eoorShipperContactPhone) {
		this.eoorShipperContactPhone = eoorShipperContactPhone;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
}
