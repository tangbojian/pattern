package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   带隐身技能的屌丝分身
 */
public class InvisibleLoser extends Loser {

	public InvisibleLoser(){
		System.out.println("制造一个带隐身技能的屌丝分身");
	}
	
	public void releaseSkills(){
		System.out.println("屌丝分身释放隐身技能");
	}
	
}
