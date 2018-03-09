package com.tbj.pattern.command.init;

/**
 * @author bjtang
 * @date   2017��7��4��  
 * @desc   ҵ����Ա�ֱ࣬��ָ�ӳ���Ա������
 */
public class Salesman {

	private String name;
	
	public Salesman(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void putDemand(Programmer programmer){
		System.out.println("ҵ��Ա" + name + "���������");
		programmer.handleDemand();
	}
	
	public void putBug(Programmer programmer){
		System.out.println("ҵ��Ա" + name + "���bug");
		programmer.handleBug();
	}
	
	public void putProblem(Programmer programmer){
		System.out.println("ҵ��Ա" + name + "�����������");
		programmer.handleProblem();
	}
	
}
