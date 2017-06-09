package com.tbj.pattern.strategy;

public class Test {

	@org.junit.Test
	public void test() {
		Strategy strategy = new ConcreteStrategyA();
		Context context = new Context();
		context.setStrategy(strategy);
		context.method();

		strategy = new ConcreteStrategyB();
		context = new Context();
		context.setStrategy(strategy);
		context.method();

		strategy = new ConcreteStrategyC();
		context = new Context();
		context.setStrategy(strategy);
		context.method();
	}

}
