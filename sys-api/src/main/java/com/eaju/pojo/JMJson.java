package com.eaju.pojo;

import java.util.ArrayList;
import java.util.List;

public class JMJson {
	private String id;
	private List<String> cell=new ArrayList<String>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getCell() {
		return cell;
	}
	public void setCell(List<String> cell) {
		this.cell = cell;
	}
	
}
