package com.tbj.pattern.adapter;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * 类适配器
 * @author bjtang
 * @date   2017年6月26日  
 * @desc   即我们继承我们希望复用其功能的类，并且实现我们想适配的接口，在这里就是 Observer ，那么就会产生一个适配器， 这个适配器具有原来类 （即 HashMap）的功能，
 * 又具有观察者接口，所以这个适配器现在就可以加入到观察者列表了。
 * 看，类适配器很简单吧？
 * @param <K>
 * @param <V>
 */
public class HashMapObserverAdpater<K, V> extends HashMap<K, V> implements Observer{

	private static final long serialVersionUID = -1700079324465155505L;

	@Override
	public void update(Observable o, Object arg) {
		//被观察者变化时,清空Map
	}

}
