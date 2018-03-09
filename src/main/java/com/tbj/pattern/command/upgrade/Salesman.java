package com.tbj.pattern.command.upgrade;

import com.tbj.pattern.command.init.Programmer;

/**
 * @author bjtang
 * @date   2017年7月7日  
 * @desc   业务员人员类
 */
public class Salesman {

	private String name;
	
	public Salesman(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void putDemand(ProductManager productManager, Programmer programmer){
		System.out.println("业务员 " + name + "提出新需求");
		productManager.receive(new Demand(programmer));
	}
	
	public void putBug(ProductManager productManager, Programmer programmer){
		System.out.println("业务员 " + name + "提出bug");
		productManager.receive(new Bug(programmer));
	}
	
	public void putProblem(ProductManager productManager, Programmer programmer){
		System.out.println("业务员 " + name + "提出线上问题");
		productManager.receive(new Problem(programmer));
	}
	
}
