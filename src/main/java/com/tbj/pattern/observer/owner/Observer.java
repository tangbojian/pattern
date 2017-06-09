package com.tbj.pattern.observer.owner;

/**
 * @interface  观察者接口
 * @author     bjtang
 * @date       2017年6月9日  
 * @desc       这个接口用来定义当被观察者状态发现改变时，观察者所需要做出的行为。
 */
public interface Observer {

	public void update(Observable o);
	
	
}
