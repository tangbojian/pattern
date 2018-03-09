package com.tbj.pattern.builder.updater;

/**
 * @author bjtang
 * @date   2017��7��25��  
 * @desc   �����彨���ߵĹ��Է��ڳ�������
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
