package com.tbj.pattern.bridge.updater;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   飞行技能
 */
public class Volant implements Skills {

	@Override
	public void releasSkills() {
		System.out.println("释放飞行技能");
	}

}
