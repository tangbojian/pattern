package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   带风行技能的高富帅分身
 */
public class VolantGfsBody extends GfsBody {

	public VolantGfsBody(){
		System.out.println("制造一个带风行技能的高富帅分身");
	}
	
	public void releaseSkills(){
		System.out.println("高富帅分身释放风行技能");
	}
	
}
