package com.tbj.pattern.iterator.updater;

/**
 * @author bjtang
 * @date   2017��8��2��  
 * @desc   Iterable�ӿ�,���ڷ���һ��Iterator. 	
 * @param <E>
 */
public interface Iterable<E> {

	Iterator<E> iterator();
	
}
