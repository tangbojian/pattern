package com.tbj.pattern.bridge.updater;

/**
 * @author bjtang
 * @date   2017��7��24��  
 * @desc   ʹ��
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
		
		//�л�����
		soul.setSkills(new ReadMind());
		soul.releaseSkills();
		System.out.println("-------------------");
		
		//�л���ò
		soul.setAppearance(new Loser());
		soul.show();
		System.out.println("-------------------");
		
		//�л�����
		soul.setSkills(new Volant());
		soul.releaseSkills();
	}
	
}
