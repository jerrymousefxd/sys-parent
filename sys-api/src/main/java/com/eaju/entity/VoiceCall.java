package com.eaju.entity;

import java.math.BigDecimal;
import java.util.Date;

public class VoiceCall {
    private BigDecimal id;

    private String phonenumberfrom;

    private String phonenumberto;

    private String loginname;

    private String originalorderno;

    private String eoororderno;

    private String etdlno;

    private String callidentifier;

    private String phoneid1;

    private String phoneid2;

    private String recordfile;

    private String creator;

    private Date createtime;

    private String updator;

    private Date updatetime;

    private String status;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPhonenumberfrom() {
        return phonenumberfrom;
    }

    public void setPhonenumberfrom(String phonenumberfrom) {
        this.phonenumberfrom = phonenumberfrom == null ? null : phonenumberfrom.trim();
    }

    public String getPhonenumberto() {
        return phonenumberto;
    }

    public void setPhonenumberto(String phonenumberto) {
        this.phonenumberto = phonenumberto == null ? null : phonenumberto.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getOriginalorderno() {
        return originalorderno;
    }

    public void setOriginalorderno(String originalorderno) {
        this.originalorderno = originalorderno == null ? null : originalorderno.trim();
    }

    public String getEoororderno() {
        return eoororderno;
    }

    public void setEoororderno(String eoororderno) {
        this.eoororderno = eoororderno == null ? null : eoororderno.trim();
    }

    public String getEtdlno() {
        return etdlno;
    }

    public void setEtdlno(String etdlno) {
        this.etdlno = etdlno == null ? null : etdlno.trim();
    }

    public String getCallidentifier() {
        return callidentifier;
    }

    public void setCallidentifier(String callidentifier) {
        this.callidentifier = callidentifier == null ? null : callidentifier.trim();
    }

    public String getPhoneid1() {
        return phoneid1;
    }

    public void setPhoneid1(String phoneid1) {
        this.phoneid1 = phoneid1 == null ? null : phoneid1.trim();
    }

    public String getPhoneid2() {
        return phoneid2;
    }

    public void setPhoneid2(String phoneid2) {
        this.phoneid2 = phoneid2 == null ? null : phoneid2.trim();
    }

    public String getRecordfile() {
        return recordfile;
    }

    public void setRecordfile(String recordfile) {
        this.recordfile = recordfile == null ? null : recordfile.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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
        this.updator = updator == null ? null : updator.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}