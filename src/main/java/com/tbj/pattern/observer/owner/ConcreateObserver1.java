package com.tbj.pattern.observer.owner;

/**
 * 
 * @author bjtang
 * @date   2017��6��9��  
 * @desc   ����Ĺ۲���
 */
public class ConcreateObserver1 implements Observer{

	public void update(Observable o) {
		System.out.println("�۲���1�۲쵽" + o.getClass().getSimpleName() + "�����˱仯");
		System.out.println("�۲���1 ������Ӧ�ķ�Ӧ");
	}

}
