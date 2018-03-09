package com.tbj.pattern.iterator.updater;


/**
 * @author bjtang
 * @date   2017年8月2日  
 * @desc   简单实现的linkedList 	
 * @param <E>
 */
public class LinkedList<E> implements Iterable<E>{

	/**头结点**/
	private Node<E> head = new Node<E>(null, null, null);
	
	/**上一个节点**/
	private Node<E> last = null;
	
	private int size;
	
	public LinkedList(){
		head.next = head.prev = head;
	}
	
	public void add(E e){
		Node<E> newNode = new Node<E>(null, e, null);
		if(head == head.next && head == head.prev){
			//表示现在只有一个头结点
			head.next = newNode;
			newNode.prev = head;
		}else{
			//表示链表除了头结点,已经有别的节点了
			newNode.prev = last;
			last.next = newNode;
		}
		//最后一个节点的尾节点指向头结点
		newNode.next = head;
		last = newNode;
		size++;
	}
	
	public int size(){
		return size;
	}
	
	public Object[] toArray(){
		Object[] result = new Object[size];
		int i = 0;
		for(Node<E> e = head.next; e != head; e = e.next){
			result[i++] = e.e;
		}
		return result;
	}
	
	private static class Node<E>{
		Node<E> prev;
		E e;
		Node<E> next;
		Node(Node<E> prev, E e, Node<E> next){
			this.prev = prev;
			this.e = e;
			this.next = next;
		}
	}

	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator<E>{
		
		private E element;;
        private Node<E> next = head;
		int cursor = 0;

		@Override
		public boolean hasNext() {
			return cursor < size();
		}

		@Override
		public E next() {
			if(!hasNext()){
				throw new RuntimeException("没有如此的一个元素异常");
			}
			element = next.next.e;
			next = next.next;
			cursor++;
			return element;
		}

		@Override
		public void remove() {
		}
	}
}
