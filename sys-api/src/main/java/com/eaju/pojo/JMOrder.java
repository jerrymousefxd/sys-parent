package com.eaju.pojo;

import java.util.Date;

public class JMOrder {
	private int id;
	private String deliverid;
	private String custid;
	private String custname;
	private String mobile;
	private String phone;
	private String mediatype;
	private String nickname;
	private String orderid;
	private Date buytime;
	private Date delivertime;
	private String channel;
	private String channelid;
	private String shop;
	private String province;
	private String city;
	private String district;
	private String address;
	private String contactname;
	private String contactphone;
	private Date reqtime;
	private Date syncdt;
	private String productcode;
	private String quantity;
	private String price;
	private String seqid;
	private String pcount;
	private String reqnote;
	private String expressco;
	private String expressno;
	private String casenumber;
	private String assetnumber;
	private String productname;

	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getContactphone() {
		return contactphone;
	}
	public void setContactphone(String contactphone) {
		this.contactphone = contactphone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeliverid() {
		return deliverid;
	}
	public void setDeliverid(String deliverid) {
		this.deliverid = deliverid;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMediatype() {
		return mediatype;
	}
	public void setMediatype(String mediatype) {
		this.mediatype = mediatype;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public Date getBuytime() {
		return buytime;
	}
	public void setBuytime(Date buytime) {
		this.buytime = buytime;
	}
	public Date getDelivertime() {
		return delivertime;
	}
	public void setDelivertime(Date delivertime) {
		this.delivertime = delivertime;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannelid() {
		return channelid;
	}
	public void setChannelid(String channelid) {
		this.channelid = channelid;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public Date getReqtime() {
		return reqtime;
	}
	public void setReqtime(Date reqtime) {
		this.reqtime = reqtime;
	}
	public Date getSyncdt() {
		return syncdt;
	}
	public void setSyncdt(Date syncdt) {
		this.syncdt = syncdt;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSeqid() {
		return seqid;
	}
	public void setSeqid(String seqid) {
		this.seqid = seqid;
	}
	public String getPcount() {
		return pcount;
	}
	public void setPcount(String pcount) {
		this.pcount = pcount;
	}
	public String getReqnote() {
		return reqnote;
	}
	public void setReqnote(String reqnote) {
		this.reqnote = reqnote;
	}
	public String getExpressco() {
		return expressco;
	}
	public void setExpressco(String expressco) {
		this.expressco = expressco;
	}
	public String getExpressno() {
		return expressno;
	}
	public void setExpressno(String expressno) {
		this.expressno = expressno;
	}
	public String getCasenumber() {
		return casenumber;
	}
	public void setCasenumber(String casenumber) {
		this.casenumber = casenumber;
	}
	public String getAssetnumber() {
		return assetnumber;
	}
	public void setAssetnumber(String assetnumber) {
		this.assetnumber = assetnumber;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seqid == null) ? 0 : seqid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JMOrder other = (JMOrder) obj;
		if (seqid == null) {
			if (other.seqid != null)
				return false;
		} else if (!seqid.equals(other.seqid))
			return false;
		return true;
	}
	public static void main(String[] args) {
		JMOrder jmOrder = new JMOrder();
		jmOrder.setSeqid("1");
		JMOrder jmOrder2 = new JMOrder();
		jmOrder2.setSeqid("1");
		jmOrder2.setAddress("1");
		System.out.println(jmOrder.equals(jmOrder2));
	}
	@Override
	public String toString() {
		return "JMOrder [id=" + id + ", deliverid=" + deliverid + ", custid=" + custid + ", custname=" + custname
				+ ", mobile=" + mobile + ", phone=" + phone + ", mediatype=" + mediatype + ", nickname=" + nickname
				+ ", orderid=" + orderid + ", buytime=" + buytime + ", delivertime=" + delivertime + ", channel="
				+ channel + ", channelid=" + channelid + ", shop=" + shop + ", province=" + province + ", city=" + city
				+ ", district=" + district + ", address=" + address + ", contactname=" + contactname + ", contactphone="
				+ contactphone + ", reqtime=" + reqtime + ", syncdt=" + syncdt + ", productcode=" + productcode
				+ ", quantity=" + quantity + ", price=" + price + ", seqid=" + seqid + ", pcount=" + pcount
				+ ", reqnote=" + reqnote + ", expressco=" + expressco + ", expressno=" + expressno + ", casenumber="
				+ casenumber + ", assetnumber=" + assetnumber + ", productname=" + productname + "]";
	}
	
}
