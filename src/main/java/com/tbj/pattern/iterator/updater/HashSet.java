package com.tbj.pattern.iterator.updater;

import java.util.HashMap;
import java.util.Map;

/***
 * @author bjtang
 * @date   2017��8��2��  
 * @desc   ����Mapʵ��HashSet 	 
 * @param <E>
 */
public class HashSet<E>{

	private static final Object NULL = new Object();
	private Map<E, Object> map = new HashMap<>();
	
	public void add(E e){
		map.put(e, NULL);
	}
	
	public int size(){
		return map.size();
	}
	
	public Object[] toArray(){
		return map.keySet().toArray();
	}
	
}
