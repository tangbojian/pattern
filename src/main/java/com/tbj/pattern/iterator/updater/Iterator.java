package com.tbj.pattern.iterator.updater;

/**
 * @author bjtang
 * @date   2017��8��2��  
 * @desc   �������ӿ�
 */
public interface Iterator<E> {

	
	boolean hasNext();
	
	E next();
	
	void remove();
	
}
