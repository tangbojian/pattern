package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017��7��24��  
 * @desc   �������ܵČ�˿����
 */
public class InvisibleLoser extends Loser {

	public InvisibleLoser(){
		System.out.println("����һ���������ܵČ�˿����");
	}
	
	public void releaseSkills(){
		System.out.println("��˿�����ͷ�������");
	}
	
}
