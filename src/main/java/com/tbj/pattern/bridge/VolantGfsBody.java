package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017��7��24��  
 * @desc   �����м��ܵĸ߸�˧����
 */
public class VolantGfsBody extends GfsBody {

	public VolantGfsBody(){
		System.out.println("����һ�������м��ܵĸ߸�˧����");
	}
	
	public void releaseSkills(){
		System.out.println("�߸�˧�����ͷŷ��м���");
	}
	
}
