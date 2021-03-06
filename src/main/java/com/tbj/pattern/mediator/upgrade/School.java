package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date 2017年7月14日
 * @desc 升级过后的门派抽象类
 */
public abstract class School {

	protected IPatternAlliance patternAlliance;

	public School(IPatternAlliance patternAlliance) {
		super();
		this.patternAlliance = patternAlliance;
	}

	public void defense() {
		System.out.println(getName() + "防御");
	}

	public void attack(School school) {
		System.out.println(getName() + "攻击" + school.getName());
	}

	// 有了中介者，将由中介者处理
	public void attackByPatternAlliance(School school) {
		patternAlliance.resolveAttack(this, school);
	}

	public void defenseByPatternAlliance() {
		patternAlliance.resolveDefense(this);
	}

	public abstract String getName();
}
