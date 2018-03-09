package com.tbj.pattern.command.upgrade;

import com.tbj.pattern.command.init.Programmer;
/**
 * @author bjtang
 * @date   2017��7��4��  
 * @desc   ������������� 	
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
