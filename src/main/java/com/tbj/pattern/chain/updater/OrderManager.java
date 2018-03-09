package com.tbj.pattern.chain.updater;

/**
 * @author bjtang
 * @date   2017��8��10��  
 * @desc   ���͹�����,��������������ģʽ�еĽ�ɫ��������������ģʽ�У�ͨ������»���һ��ר�Ÿ���ά��ά��������.
 * �ڱ����У�������Ϊ���������Ÿ�����
 */
public class OrderManager {

	private static OrderManager orderManager = new OrderManager();
	
	private Subbranch head;
	
	private Subbranch last;
	
	private OrderManager(){};
	
	public static OrderManager getInstance(){
		return orderManager;
	}
	
	public OrderManager registerSubbranch(Subbranch subbranch){
		if(head == null){
			head = last = subbranch;
		}else{
			last.setSuccessor(subbranch);
			last = subbranch;
		}
		return getInstance();
	}
	
	public boolean handleOrder(Order order){
		return head.handleOrder(order);
	}
	
}
