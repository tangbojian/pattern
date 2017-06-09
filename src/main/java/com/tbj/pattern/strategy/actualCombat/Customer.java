package com.tbj.pattern.strategy.actualCombat;

/**
 * 
 * @author bjtang
 * @date   2017年6月9日  
 * @desc   客户类 	
 */
public class Customer {

	/**
	 * 累计消费额
	 */
	private Double totalAmount = 0D;
	
	/**
	 * 本次消费额
	 */
	private Double amount = 0D;
	
	/**
	 * 用户每次买了东西之后，先计算用户到达哪一级别
	 * @param price
	 */
	public void setTotalAmount(Double price){
		this.amount = price;
		totalAmount += amount;
	}
	
	/**
	 * 计算用户最后所要付的钱
	 * @return
	 */
	public double callLastAmount(){
		return CalPriceFactory.createCalPrice(this).calPrice(amount);
	}
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	
}
