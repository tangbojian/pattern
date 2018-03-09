package com.tbj.pattern.decorator.own;

/***
 * 
 * @author bjtang
 * @date   2017��6��28��  
 * @desc   �����װ����A	
 */
public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	public void methodA(){
		System.out.println("��װ����A��չ�Ĺ���");
	}
	
	public void method() {
		System.out.println("��Ը÷�����һ��A��װ");
		super.method();
		System.out.println("A��װ����");
	}
}
