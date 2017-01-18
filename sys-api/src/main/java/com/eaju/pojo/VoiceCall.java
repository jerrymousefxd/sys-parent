package com.eaju.pojo;

public class VoiceCall {
	/**
	 * 记录号，唯一值
	 */
	private String id;
	/**
	 * 发起电话
	 */
	private String phoneNumberFrom;
	/**
	 * 目标电话
	 */
	private String phoneNumberTo;
	/**
	 * 发起人
	 */
	private String loginName;
	/**
	 * 接口报文发送时间
	 */
	private String timeStamp;
	/**
	 * 订单来源号
	 */
	private String  originalOrderNo;
	/**
	 * 工单号
	 */
	private String  etdlNo;
	public String getPhoneNumberFrom() {
		return phoneNumberFrom;
	}
	public void setPhoneNumberFrom(String phoneNumberFrom) {
		this.phoneNumberFrom = phoneNumberFrom;
	}
	public String getPhoneNumberTo() {
		return phoneNumberTo;
	}
	public void setPhoneNumberTo(String phoneNumberTo) {
		this.phoneNumberTo = phoneNumberTo;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getOriginalOrderNo() {
		return originalOrderNo;
	}
	public void setOriginalOrderNo(String originalOrderNo) {
		this.originalOrderNo = originalOrderNo;
	}
	public String getEtdlNo() {
		return etdlNo;
	}
	public void setEtdlNo(String etdlNo) {
		this.etdlNo = etdlNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
