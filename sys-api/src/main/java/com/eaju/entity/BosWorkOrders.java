package com.eaju.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BosWorkOrders {
    private BigDecimal id;

    private String eccname;

    private String eccphone;

    private String eclname;

    private Date createtime;

    private String etdlno;

    private Date eoatime;

    private Date signtime;

    private Date etdlendtime;

    private String eval;

    private String eon;

    private String wlstatus;

    private String wlaccepttime;

    private String wlacceptstation;

    private String teachname;

    private String teachtel;

    private String supname;

    private String suptel;

    private String ebcdtype;

    private String ebcucode;
    
    private String ebcuname;

    private String source;

    private String outId;

    private String status;

    private String creator;

    private Date creatortime;

    private String updator;

    private Date updatortime;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getEccname() {
        return eccname;
    }

    public void setEccname(String eccname) {
        this.eccname = eccname == null ? null : eccname.trim();
    }

    public String getEccphone() {
        return eccphone;
    }

    public void setEccphone(String eccphone) {
        this.eccphone = eccphone == null ? null : eccphone.trim();
    }

    public String getEclname() {
        return eclname;
    }

    public void setEclname(String eclname) {
        this.eclname = eclname == null ? null : eclname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getEtdlno() {
        return etdlno;
    }

    public void setEtdlno(String etdlno) {
        this.etdlno = etdlno == null ? null : etdlno.trim();
    }

    public Date getEoatime() {
        return eoatime;
    }

    public void setEoatime(Date eoatime) {
        this.eoatime = eoatime;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public Date getEtdlendtime() {
        return etdlendtime;
    }

    public void setEtdlendtime(Date etdlendtime) {
        this.etdlendtime = etdlendtime;
    }

    public String getEval() {
        return eval;
    }

    public void setEval(String eval) {
        this.eval = eval == null ? null : eval.trim();
    }

    public String getEon() {
        return eon;
    }

    public void setEon(String eon) {
        this.eon = eon == null ? null : eon.trim();
    }

    public String getWlstatus() {
        return wlstatus;
    }

    public void setWlstatus(String wlstatus) {
        this.wlstatus = wlstatus == null ? null : wlstatus.trim();
    }

    public String getWlaccepttime() {
        return wlaccepttime;
    }

    public void setWlaccepttime(String wlaccepttime) {
        this.wlaccepttime = wlaccepttime == null ? null : wlaccepttime.trim();
    }

    public String getWlacceptstation() {
        return wlacceptstation;
    }

    public void setWlacceptstation(String wlacceptstation) {
        this.wlacceptstation = wlacceptstation == null ? null : wlacceptstation.trim();
    }

    public String getTeachname() {
        return teachname;
    }

    public void setTeachname(String teachname) {
        this.teachname = teachname == null ? null : teachname.trim();
    }

    public String getTeachtel() {
        return teachtel;
    }

    public void setTeachtel(String teachtel) {
        this.teachtel = teachtel == null ? null : teachtel.trim();
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname == null ? null : supname.trim();
    }

    public String getSuptel() {
        return suptel;
    }

    public void setSuptel(String suptel) {
        this.suptel = suptel == null ? null : suptel.trim();
    }

    public String getEbcdtype() {
        return ebcdtype;
    }

    public void setEbcdtype(String ebcdtype) {
        this.ebcdtype = ebcdtype == null ? null : ebcdtype.trim();
    }

    public String getEbcucode() {
        return ebcucode;
    }

    public void setEbcucode(String ebcucode) {
        this.ebcucode = ebcucode == null ? null : ebcucode.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId == null ? null : outId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatortime() {
        return creatortime;
    }

    public void setCreatortime(Date creatortime) {
        this.creatortime = creatortime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public Date getUpdatortime() {
        return updatortime;
    }

    public void setUpdatortime(Date updatortime) {
        this.updatortime = updatortime;
    }

	public String getEbcuname() {
		return ebcuname;
	}

	public void setEbcuname(String ebcuname) {
		this.ebcuname = ebcuname;
	}
    
}