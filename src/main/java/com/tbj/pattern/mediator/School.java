package com.tbj.pattern.mediator;

/**
 * @author bjtang
 * @date   2017��7��11��  
 * @desc   ���ɳ�����
 */
public abstract class School {

	public void defense(){
		System.out.println(getName() + "����");
	}
	
	public void attack(School school){
		System.out.println(getName() + "����" + school.getName());
	}

	public abstract String getName();
	
}
