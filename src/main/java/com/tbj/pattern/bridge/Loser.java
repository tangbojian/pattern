package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   屌丝分身，可以使用屌丝分身制造带技能的屌丝分身
 */
public class Loser extends Soul {

	public Loser(){
		System.out.println("制造一个无技能的屌丝分身");
	}
	
	public void doAllLikePeople(){
		System.out.println("分身可以像正常人一样做任何事情");
	}
	
	public void show(){
		System.out.println("展示屌丝形象");
	}
	
}
