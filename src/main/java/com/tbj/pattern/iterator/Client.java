package com.tbj.pattern.iterator;

/**
 * @author bjtang
 * @date   2017年8月2日  
 * @desc   遍历自己写的三个类
 */
public class Client {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 1; i <= 11; i++){
			arrayList.add(i);
		}
		System.out.println("arrayList size: " + arrayList.size());
		Object[] array = arrayList.toArray();
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for(int i = 1; i <= 11; i++){
			linkedList.add(i);
		}
		System.out.println("linkedList size: " + linkedList.size());
		Object[] array1 = linkedList.toArray();
		for(int i = 0; i < array1.length; i++){
			System.out.println(array1[i]);
		}
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i = 1; i <= 11; i++){
			hashSet.add(i);
		}
		System.out.println("hashSet size: " + hashSet.size());
		Object[] array2 = hashSet.toArray();
		for(int i = 0; i < array1.length; i++){
			System.out.println(array2[i]);
		}
	}
	
}
