package com.tbj.pattern.strategy;
/**
 * 
 * @author bjtang
 * @date   2017年6月9日  
 * @desc   通过传入不同的策略，客户调用不同的策略计算。
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
