package com.tbj.pattern.mediator;

/**
 * @author bjtang
 * @date   2017年7月11日  
 * @desc   门派抽象类
 */
public abstract class School {

	public void defense(){
		System.out.println(getName() + "防御");
	}
	
	public void attack(School school){
		System.out.println(getName() + "攻击" + school.getName());
	}

	public abstract String getName();
	
}
