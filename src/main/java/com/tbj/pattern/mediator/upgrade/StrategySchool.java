package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date   2017年7月14日  
 * @desc   策略宫
 */
public class StrategySchool extends School {

	public StrategySchool(IPatternAlliance patternAlliance) {
		super(patternAlliance);
	}

	@Override
	public String getName() {
		return "策略宫";
	}

}
