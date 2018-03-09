package com.tbj.pattern.iterator.updater;

/***
 * 
 * @author bjtang
 * @date   2017��8��2��  
 * @desc   ��ʵ�ֵ�ArrayList 	 
 * @param <E>
 */
public class ArrayList<E> implements Iterable<E>{

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

	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator<E>{
		
		int cursor = 0;

		@Override
		public boolean hasNext() {
			return cursor < size();
		}

		@Override
		public E next() {
			return array[cursor++];
		}

		@Override
		public void remove() {}
	}
	
}
