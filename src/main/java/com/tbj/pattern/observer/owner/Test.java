package com.tbj.pattern.observer.owner;

public class Test {

	public static void main(String[] args) {
		
		Observable observable = new Observable();
		Observer o1 = new ConcreateObserver1();
		Observer o2 = new ConcreateObserver2();
		observable.addObserver(o1);
		observable.addObserver(o2);
		observable.setChange(true);
		observable.notifyAllObserver();
		
	}
}
