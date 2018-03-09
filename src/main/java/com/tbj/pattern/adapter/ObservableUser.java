package com.tbj.pattern.adapter;

import java.util.Observable;
import java.util.Observer;

public class ObservableUser extends User {

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
