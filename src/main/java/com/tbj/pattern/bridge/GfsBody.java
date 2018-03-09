package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   高富帅分身：可以使用高富帅分身制造出带技能的高富帅分身
 */ 
public class GfsBody {

	public GfsBody(){
		System.out.println("制造一个无技能的高富帅分身");
	}
	
	public void doAllLikePeople(){
		System.out.println("分身可以像正常人一样做任何事情");
	}
	
	public void show(){
		System.out.println("展示高富帅形象");
	}
	
}
