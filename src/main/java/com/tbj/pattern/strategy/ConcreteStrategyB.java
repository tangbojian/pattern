package com.tbj.pattern.strategy;

public class ConcreteStrategyB implements Strategy{

	@Override
	public void algorithm() {
		System.out.println("我是策略B计算");
	}

}
