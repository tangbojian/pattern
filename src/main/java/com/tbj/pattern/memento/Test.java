package com.tbj.pattern.memento;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Person person = new Person("tbj");
		person.addStore("第一次给我上课的老师真的丑");
		person.addStore("小时候自己可帅气了");
		List<String> storeList = person.getStoreList();
		storeList.clear();
	}
	
}
