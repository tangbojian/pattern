package com.tbj.pattern.observer.owner;

public class ConcreateObserver2 implements Observer{

	public void update(Observable o) {
		System.out.println("观察者2观察到" + o.getClass().getSimpleName() + "发生了变化");
		System.out.println("观察者2 做出相应的反应");
	}

}
