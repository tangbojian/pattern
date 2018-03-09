package com.tbj.pattern.memento.updater;

import java.util.HashMap;
import java.util.Map;


/**
 * @author bjtang
 * @date   2017��7��27��  
 * @desc   ����࣬���ڹ����˼���ı����ͻָ���ĳһʱ��
 */ 
public class Soul {
	
	private final static Map<String, Member> map = new HashMap<>();
	
	private Soul(){}

	/**
	 * �Ӷ����л�ȡ���˴�ʱ�̵ļ���,�洢������¼��
	 * @param person
	 */
	public static void getMember(Person person){
		Member member = new Member();
		member.setStoreList(person.getStoreListForce());
		map.put(person.getName(), member);
	}
	
	/**
	 * �����˵ļ�����˵�ָ����ʱ��
	 * @param person
	 */
	public static void forceFixMember(Person person){
		person.setMember(map.get(person.getName()).getStoreList());
	}
}
