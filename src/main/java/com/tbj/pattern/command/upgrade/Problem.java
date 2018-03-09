package com.tbj.pattern.command.upgrade;

import com.tbj.pattern.command.init.Programmer;
/**
 * @author bjtang
 * @date   2017年7月4日  
 * @desc   具体的线上问题任务
 */
public class Problem implements Task{
		
	private Programmer programmer;
	
	public Problem(Programmer programmer) {
		this.programmer = programmer;
	}

	@Override
	public void handle() {
		programmer.handleProblem();
	}
	
	@Override
	public String toString() {
		return "Problem [Programmer =" + programmer.getName() + "]";
	}
	
}
