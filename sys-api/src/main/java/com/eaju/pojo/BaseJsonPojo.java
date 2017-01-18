package com.eaju.pojo;

public class BaseJsonPojo {
	
	/**
     * 合作的账号,由本服务端分配
     */
	private String 	appId;
	/**
	 * 合作账户密码
	 */
    private String  password;
    /**
     * 动态token
     */
    private String  token;
    
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
