package com.tbj.pattern.bridge;

/**
 * @author bjtang
 * @date   2017��7��24��  
 * @desc   ��˿��������ʹ�Ì�˿������������ܵČ�˿����
 */
public class Loser extends Soul {

	public Loser(){
		System.out.println("����һ���޼��ܵČ�˿����");
	}
	
	public void doAllLikePeople(){
		System.out.println("���������������һ�����κ�����");
	}
	
	public void show(){
		System.out.println("չʾ��˿����");
	}
	
}
