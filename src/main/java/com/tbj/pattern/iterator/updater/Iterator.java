package com.tbj.pattern.iterator.updater;

/**
 * @author bjtang
 * @date   2017年8月2日  
 * @desc   迭代器接口
 */
public interface Iterator<E> {

	
	boolean hasNext();
	
	E next();
	
	void remove();
	
}
