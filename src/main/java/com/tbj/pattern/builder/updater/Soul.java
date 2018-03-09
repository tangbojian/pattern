package com.tbj.pattern.builder.updater;

/**
 * @author bjtang
 * @date   2017��7��25��  
 * @desc   ����ָ࣬�ӹ�
 */
public class Soul {

	/**
	 * @param doppelgangerBuilder
	 * @param name
	 * @return ��ͬ�Ĺ�������,������ͬ,���ֲ�ͬ.
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
