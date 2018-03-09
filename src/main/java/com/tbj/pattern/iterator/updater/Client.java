package com.tbj.pattern.iterator.updater;

/**
 * @author bjtang
 * @date   2017年8月3日  
 * @desc   迭代器模式测试
 */
public class Client {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 1; i <= 11; i++) {
			arrayList.add(i);
		}
		System.out.println("arrayList size:" + arrayList.size());
		Iterator<Integer> arrayListIterator = arrayList.iterator();
		while (arrayListIterator.hasNext()) {
			System.out.println(arrayListIterator.next());
		}

		System.out.println("----------------------------------------------");

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 1; i <= 11; i++) {
			linkedList.add(i);
		}
		System.out.println("linkedList size:" + linkedList.size());
		Iterator<Integer> LinkedListIterator = linkedList.iterator();
		while (LinkedListIterator.hasNext()) {
			System.out.println(LinkedListIterator.next());
		}

	}
}
