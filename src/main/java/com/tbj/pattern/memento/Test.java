package com.tbj.pattern.memento;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Person person = new Person("tbj");
		person.addStore("��һ�θ����Ͽε���ʦ��ĳ�");
		person.addStore("Сʱ���Լ���˧����");
		List<String> storeList = person.getStoreList();
		storeList.clear();
	}
	
}
