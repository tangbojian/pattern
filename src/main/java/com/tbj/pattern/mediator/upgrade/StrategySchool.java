package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date   2017��7��14��  
 * @desc   ���Թ�
 */
public class StrategySchool extends School {

	public StrategySchool(IPatternAlliance patternAlliance) {
		super(patternAlliance);
	}

	@Override
	public String getName() {
		return "���Թ�";
	}

}
