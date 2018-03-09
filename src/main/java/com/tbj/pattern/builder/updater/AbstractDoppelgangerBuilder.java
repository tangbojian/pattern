package com.tbj.pattern.builder.updater;

/**
 * @author bjtang
 * @date   2017年7月25日  
 * @desc   将具体建造者的共性放在抽象类中
 */
public abstract class AbstractDoppelgangerBuilder implements DoppelgangerBuilder{
	
	protected Doppelganger doppelganger;
	
	@Override
	public void createDoppelganger(String name) {
		doppelganger = new Doppelganger(name);
	}
	
	@Override
	public Doppelganger getDoppelganger() {
		return doppelganger;
	}

}
