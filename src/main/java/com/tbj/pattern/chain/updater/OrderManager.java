package com.tbj.pattern.chain.updater;

/**
 * @author bjtang
 * @date   2017年8月10日  
 * @desc   订餐管理部门,他并不是责任链模式中的角色，但是在责任链模式中，通常情况下会有一个专门负责维护维护责任链.
 * 在本例中，这个类称为订单管理部门更合适
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
