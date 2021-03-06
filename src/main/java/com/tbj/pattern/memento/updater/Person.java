package com.tbj.pattern.memento.updater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author bjtang
 * @date 2017年7月27日
 * @desc 人类
 */
public class Person {

	/** 姓名 **/
	private String name;

	/** 保存人从小到大的记忆,不能删除,不能修改,可以添加 **/
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

	/*** 返回不能被外部修改的List **/
	public List<String> getStoreList() {
		return Collections.unmodifiableList(storeList);
	}

	/*** 用于获取某个人某个时刻的记忆 **/
	public List<String> getStoreListForce() {
		return new ArrayList<String>(storeList);
	}

	/** 将记忆恢复到某一时刻 **/
	public void setMember(List<String> storeList) {
		this.storeList = storeList;
	}

	/*** 可以添加 **/
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
