package com.tbj.pattern.strategy;
/**
 * 
 * @author bjtang
 * @date   2017��6��9��  
 * @desc   ͨ�����벻ͬ�Ĳ��ԣ��ͻ����ò�ͬ�Ĳ��Լ��㡣
 */
public class Context {

	private Strategy strategy;
	
	public void method(){
		strategy.algorithm();
	}
	
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}
}
