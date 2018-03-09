package com.tbj.pattern.command.upgrade;

import com.tbj.pattern.command.init.Programmer;
/**
 * @author bjtang
 * @date   2017��7��4��  
 * @desc   �����bug����
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
