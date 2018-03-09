package com.tbj.pattern.memento.updater;

public class Client {

	public static void main(String[] args) {
		
		Person personA = new Person("看守所人员A");
		Person personB = new Person("看守所人员B");
		
		//看守所人员A的记忆
		personA.addStore("我小时候偷西瓜被抓了;");
		personA.addStore("初中的时候我成绩特别差;");
		
		//看守所人员B的记忆
		personB.addStore("小时候我留了个小辫子;");
		personB.addStore("我高中成绩比较好;");
		
		//获取当前时刻看守员人A和看守人员B的记忆
		Soul.getMember(personA);
		Soul.getMember(personB);
		
		//两个人共同的记忆
		personA.addStore("我今天看到了一个会飞的人,而且看清楚了他的长相;");
		personB.addStore("我今天看到了一个会飞的人,而且看清楚了他的长相;");
		
		Soul.forceFixMember(personA);
		Soul.forceFixMember(personB);
		System.out.println(personA);
		System.out.println(personB);
		
	}
	
}
