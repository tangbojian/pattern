package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date   2017年7月14日  
 * @desc   模式联門，中介者接口
 */
public interface IPatternAlliance {

	//加入联門
	public void add(School school); 
	
	//提出联門
	public void remove(School school);
	
	//联門攻击
	public void resolveAttack(School activeSide, School passiveSide);
	
	//联門防御
	public void resolveDefense(School passiveSide);
	
}
