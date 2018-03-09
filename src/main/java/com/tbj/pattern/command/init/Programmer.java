package com.tbj.pattern.command.init;

/**
 * @author bjtang
 * @date   2017年7月4日  
 * @desc   程序员类，需要解决的事情 
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
		System.out.println(name + "处理新需求");
	}
	
	public void handleBug(){
		System.out.println(name + "处理bug");
	}
	
	public void handleProblem(){
		System.out.println(name + "处理线上问题");
	}
}
