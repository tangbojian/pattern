package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   带读心术技能的屌丝分身 
 */
public class ReadMindLoser extends Loser{

	public ReadMindLoser(){
		System.out.println("制造一个带读心术技能的屌丝分身");
	}
	
	public void releasSkills(){
		System.out.println("屌丝分身释放读心术技能");
	}
	
}
