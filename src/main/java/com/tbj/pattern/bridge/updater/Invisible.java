package com.tbj.pattern.bridge.updater;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   隐身技能
 */
public class Invisible implements Skills{

	@Override
	public void releasSkills() {
		System.out.println("释放隐身技能");
	}

}
