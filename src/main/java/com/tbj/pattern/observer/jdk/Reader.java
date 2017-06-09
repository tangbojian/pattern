package com.tbj.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author bjtang
 * @date   2017��6��9��  
 * @desc   �̳�jdk�Դ��Ĺ۲��߽ӿ� 	: ģ��һ��ʵ�ʰ���,��ĳ�����߷���һ������ʱ,����ö��߶�����,��ô�ڵ�һʱ���֪ͨ�˶���.
 * 
 */
public class Reader implements Observer{
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//���߿��Թ�עĳһλ����,��ע�������Լ���ӵ����ߵ��б���.
	public void subscription(String authorName){
		AuthorManage.getAuthor(authorName).addObserver(this);
	}
	
	//���߿���ȡ����עĳһλ����,ȡ���������Լ��Ӹ����ߵ��б����Ƴ�
	public void unsubscription(String authorName){
		AuthorManage.getAuthor(authorName).deleteObserver(this);
	}
	
	public void update(Observable o, Object arg) {
		if(o instanceof Author){
			Author author = (Author) o;
			System.out.println(name + "֪��" + author.getName() + "����������" + author.getLastNovel());
		}
	}

}
