package com.tbj.pattern.strategy.actualCombat.upgrade;

/**
 * 
 * @author bjtang
 * @date   2017��6��9��  
 * @desc   �ͻ��� 	
 */
public class Customer {

	/**
	 * �ۼ����Ѷ�
	 */
	private Double totalAmount = 0D;
	
	/**
	 * �������Ѷ�
	 */
	private Double amount = 0D;
	
	private CalPrice calPrice = CalPriceFactory.getInstance().createCalPrice(this);
	
	/**
	 * �û�ÿ�����˶���֮���ȼ����û�������һ����
	 * @param price
	 */
	public void setTotalAmount(Double price){
		this.amount = price;
		totalAmount += amount;
	}
	
	/**
	 * �����û������Ҫ����Ǯ
	 * @return
	 */
	public double callLastAmount(){
		return calPrice.calPrice(amount);
	}
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	
}
