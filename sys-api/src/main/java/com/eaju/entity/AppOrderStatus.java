package com.eaju.entity;

import java.math.BigDecimal;
import java.util.Date;


public class AppOrderStatus {
	private BigDecimal tbid;
	private String type;
	private String outorderno;
	private BigDecimal checkstatus;
	private String outstatus;
	private BigDecimal issuccess;
	private BigDecimal times;
	private String creator;
	private Date createtime;
	private String updator;
	private Date updatetime;
	private BigDecimal paramstatus;
	
	public BigDecimal getIssuccess() {
		return issuccess;
	}
	public void setIssuccess(BigDecimal issuccess) {
		this.issuccess = issuccess;
	}
	public BigDecimal getParamstatus() {
		return paramstatus;
	}
	public void setParamstatus(BigDecimal paramstatus) {
		this.paramstatus = paramstatus;
	}
	public BigDecimal getTbid() {
		return tbid;
	}
	public void setTbid(BigDecimal tbid) {
		this.tbid = tbid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOutorderno() {
		return outorderno;
	}
	public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}
	public BigDecimal getCheckstatus() {
		return checkstatus;
	}
	public void setCheckstatus(BigDecimal checkstatus) {
		this.checkstatus = checkstatus;
	}
	public String getOutstatus() {
		return outstatus;
	}
	public void setOutstatus(String outstatus) {
		this.outstatus = outstatus;
	}
	public BigDecimal getTimes() {
		return times;
	}
	public void setTimes(BigDecimal times) {
		this.times = times;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
	
}
