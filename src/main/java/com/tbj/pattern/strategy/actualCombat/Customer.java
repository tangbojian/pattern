package com.tbj.pattern.strategy.actualCombat;

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
		return CalPriceFactory.createCalPrice(this).calPrice(amount);
	}
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	
}
