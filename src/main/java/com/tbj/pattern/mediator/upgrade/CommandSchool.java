package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date   2017��7��14��  
 * @desc   ������
 */
public class CommandSchool extends School {

	public CommandSchool(IPatternAlliance patternAlliance) {
		super(patternAlliance);
	}

	@Override
	public String getName() {
		return "������";
	}

}
