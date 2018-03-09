package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date   2017��7��14��  
 * @desc   ������
 */
public class SingletonSchool extends School {

	public SingletonSchool(IPatternAlliance patternAlliance) {
		super(patternAlliance);
	}

	@Override
	public String getName() {
		return "������";
	}
}
