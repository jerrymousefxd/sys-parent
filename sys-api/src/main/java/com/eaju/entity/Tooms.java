package com.eaju.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Tooms {
    private BigDecimal id;

    private BigDecimal ordersn;

    private String outordersn;

    private Date createtime;

    private String creator;

    private Date updatetime;

    private String updator;

    private String status;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getOrdersn() {
        return ordersn;
    }

    public void setOrdersn(BigDecimal ordersn) {
        this.ordersn = ordersn;
    }

    public String getOutordersn() {
        return outordersn;
    }

    public void setOutordersn(String outordersn) {
        this.outordersn = outordersn == null ? null : outordersn.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}