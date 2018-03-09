package com.tbj.pattern.bridge.updater;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   读心术
 */
public class ReadMind implements Skills{

	@Override
	public void releasSkills() {
		System.out.println("释放读心术技能");
	}

}
