package com.tbj.pattern.memento.updater;

import java.util.HashMap;
import java.util.Map;


/**
 * @author bjtang
 * @date   2017年7月27日  
 * @desc   灵魂类，用于管理人记忆的备忘和恢复到某一时刻
 */ 
public class Soul {
	
	private final static Map<String, Member> map = new HashMap<>();
	
	private Soul(){}

	/**
	 * 从对象中获取此人此时刻的记忆,存储到备忘录中
	 * @param person
	 */
	public static void getMember(Person person){
		Member member = new Member();
		member.setStoreList(person.getStoreListForce());
		map.put(person.getName(), member);
	}
	
	/**
	 * 将此人的记忆回退到指定的时刻
	 * @param person
	 */
	public static void forceFixMember(Person person){
		person.setMember(map.get(person.getName()).getStoreList());
	}
}
