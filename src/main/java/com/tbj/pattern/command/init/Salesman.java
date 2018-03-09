package com.tbj.pattern.command.init;

/**
 * @author bjtang
 * @date   2017年7月4日  
 * @desc   业务人员类，直接指挥程序员做事情
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
		System.out.println("业务员" + name + "提出新需求");
		programmer.handleDemand();
	}
	
	public void putBug(Programmer programmer){
		System.out.println("业务员" + name + "提出bug");
		programmer.handleBug();
	}
	
	public void putProblem(Programmer programmer){
		System.out.println("业务员" + name + "提出线上问题");
		programmer.handleProblem();
	}
	
}
