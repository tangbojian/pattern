package com.tbj.pattern.bridge.updater;

/**
 * @author bjtang
 * @date   2017��7��24��  
 * @desc   ������
 */
public class Doppelganger extends Soul {
	
	public Doppelganger(){
		System.out.println("����һ��������ò�ͼ��ܵķ���");
	}

	@Override
	public void doAllLikePeople() {
		System.out.println("���������������һ�����κ�����");
	}

}
