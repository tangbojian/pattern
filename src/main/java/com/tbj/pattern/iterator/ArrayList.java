package com.tbj.pattern.iterator;

/***
 * 
 * @author bjtang
 * @date   2017��8��2��  
 * @desc   ��ʵ�ֵ�ArrayList 	 
 * @param <E>
 */
public class ArrayList<E> {

	/**����������ʱ��ÿ�����ӵĳ���**/
	private static final int INCRMENT = 10;
	
	/**��¼��С**/
	private int size;
	
	/**��ʼ��**/
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
