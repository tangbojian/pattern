package com.tbj.pattern.strategy.actualCombat.upgrade2;

/**
 * 
 * @author bjtang
 * @date   2017��6��9��  
 * @desc   �ͻ��� 	
 */
public class Customer {

	private Double totalAmount = 0D;//�ͻ��ڱ��̵����ѵ��ܶ�
    private Double amount = 0D;//�ͻ��������ѽ��
    private CalPrice calPrice = new Common();//ÿ���ͻ�����һ������۸�Ĳ��ԣ���ʼ������ͨ���㣬��ԭ��
    
    //�ͻ�������Ʒ���ͻ����������ܶ�
    public void buy(Double amount){
        this.amount = amount;
        totalAmount += amount;
        /* �仯�㣬���ǽ����Ե��ƶ�ת�Ƹ��˲��Թ��������ⲿ�����η����ȥ */
        calPrice = CalPriceFactory.getInstance().createCalPrice(this);
    }
    //����ͻ�����Ҫ����Ǯ
    public Double calLastAmount(){
        return calPrice.calPrice(amount);
    }
    
    public Double getTotalAmount() {
        return totalAmount;
    }
    
    public Double getAmount() {
        return amount;
    }
}
