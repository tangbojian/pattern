package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date   2017��7��14��  
 * @desc   ģʽ���T���н��߽ӿ�
 */
public interface IPatternAlliance {

	//�������T
	public void add(School school); 
	
	//������T
	public void remove(School school);
	
	//���T����
	public void resolveAttack(School activeSide, School passiveSide);
	
	//���T����
	public void resolveDefense(School passiveSide);
	
}
