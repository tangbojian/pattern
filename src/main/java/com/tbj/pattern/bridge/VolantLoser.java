package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   带风行技能的屌丝分身
 */
public class VolantLoser extends Loser{

	public VolantLoser(){
		System.out.println("制造一个带风行技能的屌丝分身");
	}
	
	public void releaseSkilles(){
		System.out.println("屌丝分身释放飞行技能");
	}
	
}
