package com.tbj.pattern.command.init;

/**
 * @author bjtang
 * @date   2017��7��4��  
 * @desc   ����Ա�࣬��Ҫ��������� 
 */
public class Programmer {

	private String name;
	
	public Programmer(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void handleDemand(){
		System.out.println(name + "����������");
	}
	
	public void handleBug(){
		System.out.println(name + "����bug");
	}
	
	public void handleProblem(){
		System.out.println(name + "������������");
	}
}
