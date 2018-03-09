package com.tbj.pattern.state;

/**
 * @author bjtang
 * @date 2017年8月14日
 * @desc 人类
 */
public class People {

	private String name;
	private State state;
	
	public People(String name, State state){
		this.name = name;
		this.state = state;
	}
	
	public void behavior(){
		System.out.println(name + "正在 " + state.behavior());
	}

}
