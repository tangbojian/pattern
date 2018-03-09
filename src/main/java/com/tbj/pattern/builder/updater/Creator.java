package com.tbj.pattern.builder.updater;

/**
 * @author bjtang
 * @date   2017年7月25日  
 * @desc   制造过程 
 */
public class Creator {

	public static void main(String[] args) {
		/**
		 * 制造一个瘦瘦的看守员
		 */
		Soul soul = new Soul();
		Doppelganger model = soul.createDoppleganger(new ThinBuilder(), "看守所人员1");
		System.out.println(model);
		
		
		/**
		 * 制造一个胖胖的看守员
		 */
		model = soul.createDoppleganger(new FatBuilder(), "看守所人员2");
		System.out.println(model);
	}
	
}
