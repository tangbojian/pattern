package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date   2017年7月14日  
 * @desc   中介者神阁
 */
public class MediatorSchool extends School {

	public MediatorSchool(IPatternAlliance patternAlliance) {
		super(patternAlliance);
	}

	@Override
	public String getName() {
		return "中介者神阁";
	}

}
