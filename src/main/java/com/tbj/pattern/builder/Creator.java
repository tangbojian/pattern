package com.tbj.pattern.builder;

/**
 * @author bjtang
 * @date   2017��7��24��  
 * @desc   �������
 */
public class Creator {

	public static void main(String[] args) {
		
		Soul soul = new Soul();
		//����һ����С�Ŀ���������Ա
		soul.createDoppelganger("��������Ա1");
		soul.createBody("���ݵ�����");
		soul.createHead("СС��ͷ");
		soul.createLeftArm("���ݵ���첲");
		soul.createLeftHand("���ݵ�����");
		soul.createRightArm("���ݵ��Ҹ첲");
		soul.createRightHand("���ݵ�����");
		soul.createLeftLeg("���ݵ�����");
		soul.createLeftFoot("СС�����");
		soul.createRightLeg("���ݵ�����");
		soul.createRightFoot("СС���ҽ�");
		System.out.println("�����" + soul.getDoppelganger());
		
		System.out.println("---------------------------");
		
		 //����һ�����ֵĿ���������Ա
        soul.createDoppelganger("��������Ա2");
        soul.createBody("���ֵ�����");
        soul.createHead("����ͷ");
        soul.createLeftArm("���ֵ���첲");
        soul.createLeftHand("���ֵ�����");
        soul.createRightArm("���ֵ��Ҹ첲");
        soul.createRightHand("���ֵ�����");
        soul.createLeftLeg("���ֵ�����");
        soul.createLeftFoot("�������");
        soul.createRightLeg("���ֵ�����");
        soul.createRightFoot("�����ҽ�");
        System.out.println("�����" + soul.getDoppelganger());
	}
	
}
