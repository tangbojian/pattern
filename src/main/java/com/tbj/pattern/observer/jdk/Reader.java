package com.tbj.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * @author bjtang
 * @date   2017年6月9日  
 * @desc   继承jdk自带的观察者接口 	: 模拟一个实际案例,当某个作者发布一个新书时,如果该读者订阅了,那么在第一时间就通知此读者.
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
	
	//读者可以关注某一位作者,关注则代表把自己添加到作者的列表里.
	public void subscription(String authorName){
		AuthorManage.getAuthor(authorName).addObserver(this);
	}
	
	//读者可以取消关注某一位作者,取消则代表把自己从该作者的列表中移除
	public void unsubscription(String authorName){
		AuthorManage.getAuthor(authorName).deleteObserver(this);
	}
	
	public void update(Observable o, Object arg) {
		if(o instanceof Author){
			Author author = (Author) o;
			System.out.println(name + "知道" + author.getName() + "发布了新书" + author.getLastNovel());
		}
	}

}
