package com.tbj.pattern.observer.owner;

/**
 * 
 * @author bjtang
 * @date   2017年6月9日  
 * @desc   具体的观察者
 */
public class ConcreateObserver1 implements Observer{

	public void update(Observable o) {
		System.out.println("观察者1观察到" + o.getClass().getSimpleName() + "发生了变化");
		System.out.println("观察者1 做出相应的反应");
	}

}
