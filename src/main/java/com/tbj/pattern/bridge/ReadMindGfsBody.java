package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   带读心术技能的高富帅分身
 */
public class ReadMindGfsBody extends GfsBody {

	public ReadMindGfsBody(){
		System.out.println("制造一个带读心术技能的高富帅分身");
	}
	
	public void releaseSkills(){
		System.out.println("高富帅分身释放读心术技能");
	}
	
}
