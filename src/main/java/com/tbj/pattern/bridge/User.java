package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   进行使用 
 */
public class User {

	public static void main(String[] args) {
		
		InvisibleLoser invisibleLoser = new InvisibleLoser();
		invisibleLoser.releaseSkills();
		System.out.println("------------------------------");
		
		ReadMindGfsBody gfsBody = new ReadMindGfsBody();
		gfsBody.releaseSkills();
		System.out.println("-------------------------------");
		
		VolantGfsBody volantGfsBody = new VolantGfsBody();
		volantGfsBody.releaseSkills();
		
	}
	
}
