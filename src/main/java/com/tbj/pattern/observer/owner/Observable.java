package com.tbj.pattern.observer.owner;

import java.util.HashSet;
import java.util.Set;

/**
 * @interface          ���۲�����
 * @author             bjtang
 * @date               2017��6��9��  
 * @desc			
 */
public class Observable {
	
	
	private boolean change = false;

	/**
	 * ���Ⱦ���һ���۲����б�
	 */
	private Set<Observer> set = new HashSet<Observer>();
	
	/**
	 * ��ӹ۲��ߵķ���
	 * @param o
	 */
	public void addObserver(Observer o){
		set.add(o);
	}
	
	/**
	 * �Ƴ��۲��ߵķ���
	 */
	public void removeObserver(Observer o){
		set.remove(o);
	}
	
	/**
	 * ֪ͨ���й۲���
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
