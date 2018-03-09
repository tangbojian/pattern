package com.tbj.pattern.command.upgrade;

import com.tbj.pattern.command.init.Programmer;
/**
 * @author bjtang
 * @date   2017年7月4日  
 * @desc   具体的需求任务 	
 */
public class Demand implements Task {
	
	private Programmer programmer;
	
	public Demand(Programmer programmer){
		this.programmer = programmer;
	}

	@Override
	public void handle() {
		programmer.handleDemand();
	}
	
	@Override
	public String toString() {
		return "Demand [Programmer =" + programmer.getName() + "]";
	}

}
