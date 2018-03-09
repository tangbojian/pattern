package com.tbj.pattern.memento.updater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author bjtang
 * @date 2017��7��27��
 * @desc ����
 */
public class Person {

	/** ���� **/
	private String name;

	/** �����˴�С����ļ���,����ɾ��,�����޸�,������� **/
	private List<String> storeList = new ArrayList<String>();

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*** ���ز��ܱ��ⲿ�޸ĵ�List **/
	public List<String> getStoreList() {
		return Collections.unmodifiableList(storeList);
	}

	/*** ���ڻ�ȡĳ����ĳ��ʱ�̵ļ��� **/
	public List<String> getStoreListForce() {
		return new ArrayList<String>(storeList);
	}

	/** ������ָ���ĳһʱ�� **/
	public void setMember(List<String> storeList) {
		this.storeList = storeList;
	}

	/*** ������� **/
	public void addStore(String store) {
		storeList.add(store);
	}

	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		for (String store : storeList) {
			stringBuffer.append(store).append("\n");
		}
		return stringBuffer.toString();
	}
}
