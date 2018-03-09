package com.tbj.pattern.decorator.own;
/***
 * 
 * @author bjtang
 * @date   2017��6��28��  
 * @desc   ����������ǵĳ���װ��������,����Ҫ��Ϊװ��������������Ҫװ�ε�Ŀ����ʲô,����Component���л�����װ��.
 */
public class Decorator implements Component {
	
	protected Component component;
	
	public Decorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void method() {
		component.method();
	}

}
