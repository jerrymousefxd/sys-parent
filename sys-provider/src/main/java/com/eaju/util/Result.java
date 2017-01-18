package com.eaju.util;

public class Result {
	/**
	 * 结果状态码,1-成功,0-失败
	 */
	private String code;
	/**
	 * 返回消息
	 */
	private String mess;
	/**
	 * token
	 */
	private String token;
	/**
	 * 过期时间
	 */
	private String expiretime;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getExpiretime() {
		return expiretime;
	}

	public void setExpiretime(String expiretime) {
		this.expiretime = expiretime;
	}
	
}
