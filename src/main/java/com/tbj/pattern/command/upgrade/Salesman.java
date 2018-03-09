package com.tbj.pattern.command.upgrade;

import com.tbj.pattern.command.init.Programmer;

/**
 * @author bjtang
 * @date   2017��7��7��  
 * @desc   ҵ��Ա��Ա��
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
		System.out.println("ҵ��Ա " + name + "���������");
		productManager.receive(new Demand(programmer));
	}
	
	public void putBug(ProductManager productManager, Programmer programmer){
		System.out.println("ҵ��Ա " + name + "���bug");
		productManager.receive(new Bug(programmer));
	}
	
	public void putProblem(ProductManager productManager, Programmer programmer){
		System.out.println("ҵ��Ա " + name + "�����������");
		productManager.receive(new Problem(programmer));
	}
	
}
