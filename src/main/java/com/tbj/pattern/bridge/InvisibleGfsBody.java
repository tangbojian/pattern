package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017��7��24��  
 * @desc   �������ܵĸ߸�˧����
 */
public class InvisibleGfsBody extends GfsBody {

	public InvisibleGfsBody(){
		System.out.println("����һ���������ܵĸ߸�˧����");
	}
	
	public void releaseSkills(){
		System.out.println("�߸�˧�����ͷ�������");
	}
	
}
