package com.tbj.pattern.flyweight.updater;

/**
 * @author bjtang
 * @date   2017年8月7日  
 * @desc   魔法巫师实现类
 */
public class Lion extends AbstractHero {

	@Override
	public String getName() {
		return "魔法巫师";
	}

	@Override
	public void initSkills() {
		skills[0] = "穿刺";
		skills[1] = "妖术";
		skills[2] = "法力汲取";
		skills[3] = "死亡一指";
	}

}
