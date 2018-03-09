package com.tbj.pattern.flyweight;

/**
 * @author bjtang
 * @date   2017年8月7日  
 * @desc   影魔实现类
 */
public class SF extends AbstractHero {

	@Override
	public String getName() {
		return "影魔";
	}

	@Override
	public void initSkills() {
		skills[0] = "毁灭阴影";
        skills[1] = "支配死灵";
        skills[2] = "魔王降临";
        skills[3] = "魂之挽歌";
	}

}
