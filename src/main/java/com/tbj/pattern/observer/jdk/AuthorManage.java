package com.tbj.pattern.observer.jdk;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author bjtang
 * @date   2017��6��9��  
 * @desc   ������������
 */
public class AuthorManage {

	/**
	 * �����б�
	 * key: ��������
	 * value: ���߶���
	 */
	private static Map<String, Author> map = new HashMap<>();
	
	/**
	 * �������
	 */
	public static void addAuthor(Author model){
		map.put(model.getName(), model);
	}
	
	/**
	 * �Ƴ�����
	 */
	public static void remove(String name){
		if(map == null) return;
		map.remove(name);
	}
	
	/**
	 * ���߶���ĳһ������
	 * @param name
	 * @param o
	 */
	public static Author getAuthor(String name){
		if(map == null || map.get(name) == null){
			throw new RuntimeException();
		}
		return map.get(name);
	}
	
	private AuthorManage(){}
	
}
