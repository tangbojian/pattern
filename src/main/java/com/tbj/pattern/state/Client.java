package com.tbj.pattern.state;

public class Client {

	public static void main(String[] args) {
		
		State state = new SleepState();
		State state2 = new WorkState();
		State state3 = new RestState();
		
		People people = new People("tbj", state);
		people.behavior();
		people = new People("tbj", state2);
		people.behavior();
		people = new People("tbj", state3);
		people.behavior();
		
	}
	
}
