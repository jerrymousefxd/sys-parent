package com.eaju.pojo;

import com.google.gson.Gson;

public class PageQuery {
	
	/**
	 * 默认每页显示多少条
	 */
	public static final int DEFAULT_PAGESIZE = 10;

	/**
	 * 每页显示数
	 */
	private int pageSize;
	
	/**
	 * 当前页
	 */
	private int currentPage;
	
	private int startIndex;
	
	private String keyWord;
	
	private String source;
	
	private String code;
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/*public PageQuery(int currentPage,int pageSize) {
		super();
		this.pageSize = pageSize < 1 ? DEFAULT_PAGESIZE:pageSize;
		this.currentPage = currentPage < 1 ? 1:currentPage;
		this.startIndex = (currentPage - 1) * pageSize;
	}
*/
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	public static void main(String[] args) {
		PageQuery pq=new PageQuery();
		Gson gson=new Gson();
		String json = gson.toJson(pq);
		System.out.println(json);
	}
	
}
