package com.eaju.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * app订单类
* <p>Title: TbOrder</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author admin
* @date 2016年11月11日
 */
public class TbOrder {
    private String fid;

    private Integer orderSn;

    private String orderType;

    private Integer orgId;

    private Integer storeId;

    private String storeName;

    private Integer warehouseId;

    private String warehouseName;

    private String outOrderSn;

    private Integer checkstatus;

    private String outStatus;

    private Date ddDate;

    private Date shDate;

    private String memberId;

    private String memberCode;

    private String shipName;

    private String shipMobile;

    private String shipAddress;

    private Integer totalProductPrice;

    private Date outCreateDate;

    private Date createDate;

    private Date lrjdedate;

    private Date ckDate;

    private Integer storesInvoiceId;

    private String storesInvoiceName;

    private String storesWorkerName;

    private String needInstall;

    private String dispatchMemo;

    private String dispatchSn;

    private String memo;

    private String memo2;

    private String invoiceInfo;

    private String workOrderId;

    private Date pushTime;

    private Integer deleteFlag;

    private Date workOrderTime;
    
    private List<TbOrderDetail> lists=new ArrayList<TbOrderDetail>();
    
    

    public List<TbOrderDetail> getLists() {
		return lists;
	}

	public void setLists(List<TbOrderDetail> lists) {
		this.lists = lists;
	}

	public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public Integer getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Integer orderSn) {
        this.orderSn = orderSn;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName == null ? null : warehouseName.trim();
    }

    public String getOutOrderSn() {
        return outOrderSn;
    }

    public void setOutOrderSn(String outOrderSn) {
        this.outOrderSn = outOrderSn == null ? null : outOrderSn.trim();
    }

    public Integer getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(Integer checkstatus) {
        this.checkstatus = checkstatus;
    }

    public String getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(String outStatus) {
        this.outStatus = outStatus == null ? null : outStatus.trim();
    }

    public Date getDdDate() {
        return ddDate;
    }

    public void setDdDate(Date ddDate) {
        this.ddDate = ddDate;
    }

    public Date getShDate() {
        return shDate;
    }

    public void setShDate(Date shDate) {
        this.shDate = shDate;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode == null ? null : memberCode.trim();
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public String getShipMobile() {
        return shipMobile;
    }

    public void setShipMobile(String shipMobile) {
        this.shipMobile = shipMobile == null ? null : shipMobile.trim();
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress == null ? null : shipAddress.trim();
    }

    public Integer getTotalProductPrice() {
        return totalProductPrice;
    }

    public void setTotalProductPrice(Integer totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }

    public Date getOutCreateDate() {
        return outCreateDate;
    }

    public void setOutCreateDate(Date outCreateDate) {
        this.outCreateDate = outCreateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLrjdedate() {
        return lrjdedate;
    }

    public void setLrjdedate(Date lrjdedate) {
        this.lrjdedate = lrjdedate;
    }

    public Date getCkDate() {
        return ckDate;
    }

    public void setCkDate(Date ckDate) {
        this.ckDate = ckDate;
    }

    public Integer getStoresInvoiceId() {
        return storesInvoiceId;
    }

    public void setStoresInvoiceId(Integer storesInvoiceId) {
        this.storesInvoiceId = storesInvoiceId;
    }

    public String getStoresInvoiceName() {
        return storesInvoiceName;
    }

    public void setStoresInvoiceName(String storesInvoiceName) {
        this.storesInvoiceName = storesInvoiceName == null ? null : storesInvoiceName.trim();
    }

    public String getStoresWorkerName() {
        return storesWorkerName;
    }

    public void setStoresWorkerName(String storesWorkerName) {
        this.storesWorkerName = storesWorkerName == null ? null : storesWorkerName.trim();
    }

    public String getNeedInstall() {
        return needInstall;
    }

    public void setNeedInstall(String needInstall) {
        this.needInstall = needInstall == null ? null : needInstall.trim();
    }

    public String getDispatchMemo() {
        return dispatchMemo;
    }

    public void setDispatchMemo(String dispatchMemo) {
        this.dispatchMemo = dispatchMemo == null ? null : dispatchMemo.trim();
    }

    public String getDispatchSn() {
        return dispatchSn;
    }

    public void setDispatchSn(String dispatchSn) {
        this.dispatchSn = dispatchSn == null ? null : dispatchSn.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getMemo2() {
        return memo2;
    }

    public void setMemo2(String memo2) {
        this.memo2 = memo2 == null ? null : memo2.trim();
    }

    public String getInvoiceInfo() {
        return invoiceInfo;
    }

    public void setInvoiceInfo(String invoiceInfo) {
        this.invoiceInfo = invoiceInfo == null ? null : invoiceInfo.trim();
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId == null ? null : workOrderId.trim();
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getWorkOrderTime() {
        return workOrderTime;
    }

    public void setWorkOrderTime(Date workOrderTime) {
        this.workOrderTime = workOrderTime;
    }
}