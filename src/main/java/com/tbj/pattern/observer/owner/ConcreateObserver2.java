package com.tbj.pattern.observer.owner;

public class ConcreateObserver2 implements Observer{

	public void update(Observable o) {
		System.out.println("�۲���2�۲쵽" + o.getClass().getSimpleName() + "�����˱仯");
		System.out.println("�۲���2 ������Ӧ�ķ�Ӧ");
	}

}
