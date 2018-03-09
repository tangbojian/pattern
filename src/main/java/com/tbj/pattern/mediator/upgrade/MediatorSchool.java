package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date   2017��7��14��  
 * @desc   �н������
 */
public class MediatorSchool extends School {

	public MediatorSchool(IPatternAlliance patternAlliance) {
		super(patternAlliance);
	}

	@Override
	public String getName() {
		return "�н������";
	}

}
