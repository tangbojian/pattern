package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date 2017��7��14��
 * @desc ������������ɳ�����
 */
public abstract class School {

	protected IPatternAlliance patternAlliance;

	public School(IPatternAlliance patternAlliance) {
		super();
		this.patternAlliance = patternAlliance;
	}

	public void defense() {
		System.out.println(getName() + "����");
	}

	public void attack(School school) {
		System.out.println(getName() + "����" + school.getName());
	}

	// �����н��ߣ������н��ߴ���
	public void attackByPatternAlliance(School school) {
		patternAlliance.resolveAttack(this, school);
	}

	public void defenseByPatternAlliance() {
		patternAlliance.resolveDefense(this);
	}

	public abstract String getName();
}
