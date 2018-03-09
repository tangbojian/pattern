package com.tbj.pattern.decorator.own;

/**
 * 
 * @author bjtang
 * @date   2017年6月28日  
 * @desc   具体的接口实现类,也就是俗称的原始对象,或者说待装饰对象
 */
public class ConcreteComponent implements Component {

	@Override
	public void method() {
		System.out.println("原来的方法");
	}

}
