package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   带隐身技能的高富帅分身
 */
public class InvisibleGfsBody extends GfsBody {

	public InvisibleGfsBody(){
		System.out.println("制造一个带隐身技能的高富帅分身");
	}
	
	public void releaseSkills(){
		System.out.println("高富帅分身释放隐身技能");
	}
	
}
