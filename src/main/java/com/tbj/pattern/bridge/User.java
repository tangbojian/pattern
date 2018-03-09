package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017��7��24��  
 * @desc   ����ʹ�� 
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
