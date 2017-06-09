package com.tbj.pattern.observer.jdk;

import java.util.Observable;
/**
 * 
 * @author bjtang
 * @date   2017年6月9日  
 * @desc   被观察者：只需要实现jdk提供的Observable 类，然后定义自己的属性，当满足改变条件，调用jdk的setChaged()和notifyObservers()
 * 方法。被观察者只依赖于 Observer 抽象接口，被观察者不需要关注我需要通知谁，只知道会通知实现了 Observer 接口的类。这就是面向抽象变成。
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
	 * 当作者发布新书时,通知订阅者
	 * @param novel
	 */
	public void addNovel(String novel){
		System.out.println(name + "发布了新书《" + novel + "》!");
		lastNovel = novel;
		setChanged();
		notifyObservers();
	}
	
	

}
