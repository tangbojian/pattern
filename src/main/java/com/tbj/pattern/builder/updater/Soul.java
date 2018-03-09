package com.tbj.pattern.builder.updater;

/**
 * @author bjtang
 * @date   2017年7月25日  
 * @desc   灵魂类，指挥官
 */
public class Soul {

	/**
	 * @param doppelgangerBuilder
	 * @param name
	 * @return 相同的构建过程,参数不同,表现不同.
	 */
	public Doppelganger createDoppleganger(DoppelgangerBuilder doppelgangerBuilder, String name){
		doppelgangerBuilder.createDoppelganger(name);
		doppelgangerBuilder.buildBody();
		doppelgangerBuilder.buildHead();
		doppelgangerBuilder.buildLeftArm();
		doppelgangerBuilder.buildLeftHand();
		doppelgangerBuilder.buildRightArm();
		doppelgangerBuilder.buildRightHand();
		doppelgangerBuilder.buildLeftLeg();
		doppelgangerBuilder.buildLeftFoot();
		doppelgangerBuilder.buildRightLeg();
		doppelgangerBuilder.buildRightFoot();
		return doppelgangerBuilder.getDoppelganger();
	}
	
}
