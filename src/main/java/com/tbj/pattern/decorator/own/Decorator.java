package com.tbj.pattern.decorator.own;
/***
 * 
 * @author bjtang
 * @date   2017年6月28日  
 * @desc   下面便是我们的抽象装饰器父类,它主要是为装饰器定义我们需要装饰的目标是什么,并对Component进行基础的装饰.
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
