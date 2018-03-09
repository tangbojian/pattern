package com.tbj.pattern.iterator;

/***
 * 
 * @author bjtang
 * @date   2017年8月2日  
 * @desc   简单实现的ArrayList 	 
 * @param <E>
 */
public class ArrayList<E> {

	/**当数组满的时候，每次增加的长度**/
	private static final int INCRMENT = 10;
	
	/**记录大小**/
	private int size;
	
	/**初始化**/
	private E[] array = (E[]) new Object[10];
	
	public void add(E e){
		if(size < array.length){
			array[size++] = e;
		}else{
			E[] copy = (E[]) new Object[array.length + INCRMENT];
			System.arraycopy(array, 0, copy, 0, size);
			copy[size++] = e;
			array = copy;
		}
	}
	
	public Object[] toArray(){
		Object[] copy = new Object[size];
		System.arraycopy(array, 0, copy, 0, size);
		return copy;
	}
	
	public int size(){
		return size;
	}
	
}
