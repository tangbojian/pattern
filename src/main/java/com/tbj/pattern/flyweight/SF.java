package com.tbj.pattern.flyweight;

/**
 * @author bjtang
 * @date   2017��8��7��  
 * @desc   Ӱħʵ����
 */
public class SF extends AbstractHero {

	@Override
	public String getName() {
		return "Ӱħ";
	}

	@Override
	public void initSkills() {
		skills[0] = "������Ӱ";
        skills[1] = "֧������";
        skills[2] = "ħ������";
        skills[3] = "��֮���";
	}

}
