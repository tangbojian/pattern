package com.tbj.pattern.decorator.own;

public class Main {

	public static void main(String[] args) {
		
		Component component = new ConcreteComponent();
		System.out.println("-----------------------------");
		component.method();
		
		ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
		System.out.println("---------------------------------");
		concreteDecoratorA.method();
		concreteDecoratorA.methodA();
		
		ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);
		System.out.println("---------------------------------");
		concreteDecoratorB.method();
		concreteDecoratorB.methodB();
		
		//װ�γ�A�Ժ���װ�γ�B
		concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);
		System.out.println("---------------------------------");
		concreteDecoratorB.method();
		concreteDecoratorB.methodB();
		
		
		
	}
	
}
