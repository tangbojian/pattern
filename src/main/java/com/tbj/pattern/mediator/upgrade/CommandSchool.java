package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date   2017年7月14日  
 * @desc   命令门
 */
public class CommandSchool extends School {

	public CommandSchool(IPatternAlliance patternAlliance) {
		super(patternAlliance);
	}

	@Override
	public String getName() {
		return "命令门";
	}

}
