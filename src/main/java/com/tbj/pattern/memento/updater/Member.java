package com.tbj.pattern.memento.updater;

import java.util.List;

/**
 * @author bjtang
 * @date   2017年7月27日  
 * @desc   用于存储人类某一个时刻的记忆状态，以便于需要的时候恢复用(备忘录)
 */
public class Member {

	private List<String> storeList;

	public List<String> getStoreList() {
		return storeList;
	}

	public void setStoreList(List<String> storeList) {
		this.storeList = storeList;
	}
	
}
