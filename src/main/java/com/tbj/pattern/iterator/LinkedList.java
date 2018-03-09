package com.tbj.pattern.iterator;

/**
 * @author bjtang
 * @date   2017��8��2��  
 * @desc   ��ʵ�ֵ�linkedList 	
 * @param <E>
 */
public class LinkedList<E> {

	/**ͷ���**/
	private Node<E> head = new Node<E>(null, null, null);
	
	/**��һ���ڵ�**/
	private Node<E> last = null;
	
	private int size;
	
	public LinkedList(){
		head.next = head.prev = head;
	}
	
	public void add(E e){
		Node<E> newNode = new Node<E>(null, e, null);
		if(head == head.next && head == head.prev){
			//��ʾ����ֻ��һ��ͷ���
			head.next = newNode;
			newNode.prev = head;
		}else{
			//��ʾ�������ͷ���,�Ѿ��б�Ľڵ���
			newNode.prev = last;
			last.next = newNode;
		}
		//���һ���ڵ��β�ڵ�ָ��ͷ���
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
}
