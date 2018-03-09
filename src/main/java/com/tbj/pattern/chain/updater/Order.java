package com.tbj.pattern.chain.updater;

import java.util.Map;

/**
 * @author bjtang
 * @date 2017年8月10日
 * @desc 订单类.
 */
public class Order {

	private int x;
	private int y;
	private Map<String, Integer> order;
	
	public Order(int x, int y, Map<String, Integer> order){
		this.x = x;
		this.y = y;
		this.order = order;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Map<String, Integer> getOrder() {
		return order;
	}

	public void setOrder(Map<String, Integer> order) {
		this.order = order;
	}

}
