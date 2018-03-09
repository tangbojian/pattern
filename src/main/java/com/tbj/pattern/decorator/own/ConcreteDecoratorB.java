package com.tbj.pattern.decorator.own;

/***
 * 
 * @author bjtang
 * @date   2017��6��28��  
 * @desc   �����װ����B
 */
public class ConcreteDecoratorB extends Decorator{

	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	public void methodB(){
		System.out.println("��װ����B��չ�Ĺ���");
	}
	
	public void method() {
		System.out.println("��Ը÷�����һ��B��װ");
		super.method();
		System.out.println("B��װ����");
	}
	
}
