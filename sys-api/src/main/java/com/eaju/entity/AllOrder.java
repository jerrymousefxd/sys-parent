package com.eaju.entity;

import java.util.List;

/**
 * 订单信息
 */
public class AllOrder {
	public String getSignTime() {
		return signTime;
	}

	public String getEtdlEndTime() {
		return etdlEndTime;
	}

	/**
	 * 收货人
	 */
	private String eccName;

	/**
	 * 电话
	 */
	private String eccPhone;
	
	/**
	 * 收货人地址
	 */
	private String eclName;
	
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 工单号
	 */
	private String etdlNo;
	/**
	 *   预约时间
	 */
	private String eoaTime;
	/**
	 * 签到时间
	 */
	private String signTime;
	/**
	 * 完成时间
	 */
	private String etdlEndTime;
	/**
	 * 评价
	 */
	private String eval;
	/**
	 * 物流订单状态
	 */
	private String wlStatus;
	/**
	 * 物流签收时间
	 */
	private String wlAcceptTime;
	/**
	 * 物流处理内容
	 */
	private String wlAcceptStation;
	/**
	 * 技师名称
	 */
	private String teachName;
	/**
	 * 技师电话
	 */
	private String teachTel;
	/**
	 * 服务商名称
	 */
	private String supName;
	/**
	 * 服务商联系方式
	 */
	private String supTel;
	/**
	 * 派工单类型
	 */
	private String ebcdType;
	/**
	 * 商店编码
	 */
	private String ebcuCode;
	/**
	 * 商店名称
	 */
	private String ebcuName;
	/**
	 * 订单号
	 */
	private String eon;
	
	private List<Product> orderItem;

	public String getEccName() {
		return eccName;
	}

	public void setEccName(String eccName) {
		this.eccName = eccName;
	}

	public String getEccPhone() {
		return eccPhone;
	}

	public void setEccPhone(String eccPhone) {
		this.eccPhone = eccPhone;
	}

	public String getEclName() {
		return eclName;
	}

	public void setEclName(String eclName) {
		this.eclName = eclName;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public void setEtdlEndTime(String etdlEndTime) {
		this.etdlEndTime = etdlEndTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getEtdlNo() {
		return etdlNo;
	}

	public void setEtdlNo(String etdlNo) {
		this.etdlNo = etdlNo;
	}

	public String getEoat() {
		return eoaTime;
	}

	public void setEoat(String eoaTime) {
		this.eoaTime = eoaTime;
	}


	public String getEon() {
		return eon;
	}

	public void setEon(String eon) {
		this.eon = eon;
	}

	public List<Product> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<Product> orderItem) {
		this.orderItem = orderItem;
	}

	public String getEoaTime() {
		return eoaTime;
	}

	public void setEoaTime(String eoaTime) {
		this.eoaTime = eoaTime;
	}

	public String getEval() {
		return eval;
	}

	public void setEval(String eval) {
		this.eval = eval;
	}

	public String getWlStatus() {
		return wlStatus;
	}

	public void setWlStatus(String wlStatus) {
		this.wlStatus = wlStatus;
	}

	public String getWlAcceptTime() {
		return wlAcceptTime;
	}

	public void setWlAcceptTime(String wlAcceptTime) {
		this.wlAcceptTime = wlAcceptTime;
	}

	public String getWlAcceptStation() {
		return wlAcceptStation;
	}

	public void setWlAcceptStation(String wlAcceptStation) {
		this.wlAcceptStation = wlAcceptStation;
	}

	public String getTeachName() {
		return teachName;
	}

	public void setTeachName(String teachName) {
		this.teachName = teachName;
	}

	public String getTeachTel() {
		return teachTel;
	}

	public void setTeachTel(String teachTel) {
		this.teachTel = teachTel;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getSupTel() {
		return supTel;
	}

	public void setSupTel(String supTel) {
		this.supTel = supTel;
	}

	public String getEbcdType() {
		return ebcdType;
	}

	public void setEbcdType(String ebcdType) {
		this.ebcdType = ebcdType;
	}

	public String getEbcuCode() {
		return ebcuCode;
	}

	public void setEbcuCode(String ebcuCode) {
		this.ebcuCode = ebcuCode;
	}

	public String getEbcuName() {
		return ebcuName;
	}

	public void setEbcuName(String ebcuName) {
		this.ebcuName = ebcuName;
	}
	
}
