package com.tbj.pattern.iterator.updater;

/**
 * @author bjtang
 * @date   2017年8月2日  
 * @desc   Iterable接口,用于返回一个Iterator. 	
 * @param <E>
 */
public interface Iterable<E> {

	Iterator<E> iterator();
	
}
