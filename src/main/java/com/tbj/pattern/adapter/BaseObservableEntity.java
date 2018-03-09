package com.tbj.pattern.adapter;

import java.util.Observable;
import java.util.Observer;
/**
 * 
 * @author bjtang
 * @date   2017��6��26��  
 * @desc   ������չBaseEntity,�������һ���ɹ۲��ʵ�����
 */
public class BaseObservableEntity extends BaseEntity{

	private Observable observable = new Observable();
	
	public synchronized void addObserver(Observer o) {
        observable.addObserver(o);
    }

    public synchronized void deleteObserver(Observer o) {
        observable.deleteObserver(o);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void notifyObservers(Object arg) {
        observable.notifyObservers(arg);
    }

    public synchronized void deleteObservers() {
        observable.deleteObservers();
    }

    public synchronized boolean hasChanged() {
        return observable.hasChanged();
    }

    public synchronized int countObservers() {
        return observable.countObservers();
    }
	
	
}
