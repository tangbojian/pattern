package com.tbj.pattern.observer.jdk;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author bjtang
 * @date   2017年6月9日  
 * @desc   用来管理作者
 */
public class AuthorManage {

	/**
	 * 作者列表
	 * key: 作者名称
	 * value: 作者对象
	 */
	private static Map<String, Author> map = new HashMap<>();
	
	/**
	 * 添加作者
	 */
	public static void addAuthor(Author model){
		map.put(model.getName(), model);
	}
	
	/**
	 * 移除作者
	 */
	public static void remove(String name){
		if(map == null) return;
		map.remove(name);
	}
	
	/**
	 * 读者订阅某一个作者
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
