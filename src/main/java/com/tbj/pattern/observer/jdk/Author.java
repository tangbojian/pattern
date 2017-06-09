package com.tbj.pattern.observer.jdk;

import java.util.Observable;
/**
 * 
 * @author bjtang
 * @date   2017��6��9��  
 * @desc   ���۲��ߣ�ֻ��Ҫʵ��jdk�ṩ��Observable �࣬Ȼ�����Լ������ԣ�������ı�����������jdk��setChaged()��notifyObservers()
 * ���������۲���ֻ������ Observer ����ӿڣ����۲��߲���Ҫ��ע����Ҫ֪ͨ˭��ֻ֪����֪ͨʵ���� Observer �ӿڵ��ࡣ�������������ɡ�
 */
public class Author extends Observable{
	
	private String name;
	
	private String lastNovel;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getLastNovel() {
		return lastNovel;
	}

	public void setLastNovel(String lastNovel) {
		this.lastNovel = lastNovel;
	}
	
	/**
	 * �����߷�������ʱ,֪ͨ������
	 * @param novel
	 */
	public void addNovel(String novel){
		System.out.println(name + "���������顶" + novel + "��!");
		lastNovel = novel;
		setChanged();
		notifyObservers();
	}
	
	

}
