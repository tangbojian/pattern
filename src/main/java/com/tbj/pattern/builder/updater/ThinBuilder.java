package com.tbj.pattern.builder.updater;

/**
 * @author bjtang
 * @date   2017��7��25��  
 * @desc   �ݵķ�������
 */
public class ThinBuilder extends AbstractDoppelgangerBuilder implements DoppelgangerBuilder{
	
	public void buildBody() {
		System.out.println("����" + doppelganger.getName() + "�����ݵ�����");
		doppelganger.setBody("���ݵ�����");
	}

	public void buildHead() {
		System.out.println("����" + doppelganger.getName() + "��СС��ͷ");
		doppelganger.setHead("СС��ͷ");
	}

	public void buildLeftArm() {
		System.out.println("����" + doppelganger.getName() + "�����ݵ���첲");
		doppelganger.setLeftArm("���ݵ���첲");
	}

	public void buildLeftHand() {
		System.out.println("����" + doppelganger.getName() + "�����ݵ�����");
		doppelganger.setLeftHand("���ݵ�����");
	}

	public void buildRightArm() {
		System.out.println("����" + doppelganger.getName() + "�����ݵ��Ҹ첲");
		doppelganger.setRightArm("���ݵ��Ҹ첲");
	}

	public void buildRightHand() {
		System.out.println("����" + doppelganger.getName() + "�����ݵ�����");
		doppelganger.setRightHand("���ݵ�����");
	}

	public void buildLeftLeg() {
		System.out.println("����" + doppelganger.getName() + "�����ݵ�����");
		doppelganger.setLeftLeg("���ݵ�����");
	}

	public void buildLeftFoot() {
		System.out.println("����" + doppelganger.getName() + "��СС�����");
		doppelganger.setLeftFoot("СС�����");
	}

	public void buildRightLeg() {
		System.out.println("����" + doppelganger.getName() + "�����ݵ�����");
		doppelganger.setRightLeg("���ݵ�����");
	}

	public void buildRightFoot() {
		System.out.println("����" + doppelganger.getName() + "��СС���ҽ�");
		doppelganger.setRightFoot("СС���ҽ�");
	}
	
}
