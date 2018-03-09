package com.tbj.pattern.flyweight.updater;

/**
 * @author bjtang
 * @date   2017��8��7��  
 * @desc   ħ����ʦʵ����
 */
public class Lion extends AbstractHero {

	@Override
	public String getName() {
		return "ħ����ʦ";
	}

	@Override
	public void initSkills() {
		skills[0] = "����";
		skills[1] = "����";
		skills[2] = "������ȡ";
		skills[3] = "����һָ";
	}

}
