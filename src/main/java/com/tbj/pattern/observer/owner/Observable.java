package com.tbj.pattern.observer.owner;

import java.util.HashSet;
import java.util.Set;

/**
 * @interface          被观察者类
 * @author             bjtang
 * @date               2017年6月9日  
 * @desc			
 */
public class Observable {
	
	
	private boolean change = false;

	/**
	 * 首先具体一个观察者列表
	 */
	private Set<Observer> set = new HashSet<Observer>();
	
	/**
	 * 添加观察者的方法
	 * @param o
	 */
	public void addObserver(Observer o){
		set.add(o);
	}
	
	/**
	 * 移除观察者的方法
	 */
	public void removeObserver(Observer o){
		set.remove(o);
	}
	
	/**
	 * 通知所有观察者
	 */
	public void notifyAllObserver(){
		if(!change) return;
		for(Observer o : set){
			try {
				o.update(this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void setChange(boolean change){
		this.change = change;
	}
	
}
