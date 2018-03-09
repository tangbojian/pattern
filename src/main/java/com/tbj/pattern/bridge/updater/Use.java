package com.tbj.pattern.bridge.updater;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   使用
 */
public class Use {

	public static void main(String[] args) {
		
		Soul soul = new Doppelganger();
		soul.setAppearance(new GfsBody());
		soul.setSkills(new Invisible());
		soul.doAllLikePeople();
		System.out.println("--------------------");
		soul.show();
		soul.releaseSkills();
		
		System.out.println("-------------------");
		
		//切换技能
		soul.setSkills(new ReadMind());
		soul.releaseSkills();
		System.out.println("-------------------");
		
		//切换外貌
		soul.setAppearance(new Loser());
		soul.show();
		System.out.println("-------------------");
		
		//切换技能
		soul.setSkills(new Volant());
		soul.releaseSkills();
	}
	
}
