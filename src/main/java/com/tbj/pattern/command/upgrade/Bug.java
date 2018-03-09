package com.tbj.pattern.command.upgrade;

import com.tbj.pattern.command.init.Programmer;
/**
 * @author bjtang
 * @date   2017年7月4日  
 * @desc   具体的bug任务
 */
public class Bug implements Task{
	
	private Programmer programmer;

	public Bug(Programmer programmer){
		this.programmer = programmer;
	}
	
	@Override
	public void handle() {
		programmer.handleBug();
	}
	
	@Override
	public String toString() {
		return "Bug [Programmer =" + programmer.getName() + "]";
	}

}
