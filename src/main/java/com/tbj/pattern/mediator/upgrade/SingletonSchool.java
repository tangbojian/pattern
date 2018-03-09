package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date   2017年7月14日  
 * @desc   单利宗
 */
public class SingletonSchool extends School {

	public SingletonSchool(IPatternAlliance patternAlliance) {
		super(patternAlliance);
	}

	@Override
	public String getName() {
		return "单利宗";
	}
}
