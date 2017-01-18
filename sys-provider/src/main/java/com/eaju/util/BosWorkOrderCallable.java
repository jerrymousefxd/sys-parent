package com.eaju.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import com.eaju.entity.BosWorkOrders;
import com.eaju.mapper.BosWorkOrdersMapper;

public class BosWorkOrderCallable implements Callable<Integer>{
    private BosWorkOrdersMapper bosWorkOrdersMapper;
    
	public BosWorkOrdersMapper getBosWorkOrdersMapper() {
		return bosWorkOrdersMapper;
	}

	public void setBosWorkOrdersMapper(BosWorkOrdersMapper bosWorkOrdersMapper) {
		this.bosWorkOrdersMapper = bosWorkOrdersMapper;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<BosWorkOrders> getBosWorkOrders() {
		return bosWorkOrders;
	}

	public void setBosWorkOrders(List<BosWorkOrders> bosWorkOrders) {
		this.bosWorkOrders = bosWorkOrders;
	}

	private int count; 
	private List<BosWorkOrders> bosWorkOrders =new ArrayList<BosWorkOrders>();
	public BosWorkOrderCallable() {
		super();
	}

	public BosWorkOrderCallable(List<BosWorkOrders> bosWorkOrders) {
		super();
		this.bosWorkOrders = bosWorkOrders;
	}

	@Override
	public Integer call() throws Exception {
		for (BosWorkOrders orders : bosWorkOrders) {
			int c = bosWorkOrdersMapper.findBosWorkOrdersBySourceAndId(orders.getSource(), orders.getOutId());
			if(c==0){
				int insert = bosWorkOrdersMapper.insert(orders);
				count+=insert;
			}
		}
		return count;
	}

}
