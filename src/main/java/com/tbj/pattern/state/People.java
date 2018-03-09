package com.tbj.pattern.state;

/**
 * @author bjtang
 * @date 2017��8��14��
 * @desc ����
 */
public class People {

	private String name;
	private State state;
	
	public People(String name, State state){
		this.name = name;
		this.state = state;
	}
	
	public void behavior(){
		System.out.println(name + "���� " + state.behavior());
	}

}
