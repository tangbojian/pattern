package com.tbj.pattern.builder.updater;

/**
 * @author bjtang
 * @date   2017��7��25��  
 * @desc   �ֵķ���Ľ�����
 */
public class FatBuilder extends AbstractDoppelgangerBuilder implements DoppelgangerBuilder {
	
	public void buildBody() {
        System.out.println("����" + doppelganger.getName() + "�����ֵ�����");
        doppelganger.setBody("���ֵ�����");
    }

    public void buildHead() {
        System.out.println("����" + doppelganger.getName() + "�Ĵ���ͷ");
        doppelganger.setHead("����ͷ");
    }

    public void buildLeftArm() {
        System.out.println("����" + doppelganger.getName() + "�����ֵ���첲");
        doppelganger.setLeftArm("���ֵ���첲");
    }

    public void buildLeftHand() {
        System.out.println("����" + doppelganger.getName() + "�����ֵ�����");
        doppelganger.setLeftHand("���ֵ�����");
    }

    public void buildRightArm() {
        System.out.println("����" + doppelganger.getName() + "�����ֵ��Ҹ첲");
        doppelganger.setRightArm("���ֵ��Ҹ첲");
    }

    public void buildRightHand() {
        System.out.println("����" + doppelganger.getName() + "�����ֵ�����");
        doppelganger.setRightHand("���ֵ�����");
    }
    
    public void buildLeftLeg() {
        System.out.println("����" + doppelganger.getName() + "�����ֵ�����");
        doppelganger.setLeftLeg("���ֵ�����");
    }

    public void buildLeftFoot() {
        System.out.println("����" + doppelganger.getName() + "�Ĵ������");
        doppelganger.setLeftFoot("�������");
    }

    public void buildRightLeg() {
        System.out.println("����" + doppelganger.getName() + "�����ֵ�����");
        doppelganger.setRightLeg("���ֵ�����");
    }

    public void buildRightFoot() {
        System.out.println("����" + doppelganger.getName() + "�Ĵ����ҽ�");
        doppelganger.setRightFoot("�����ҽ�");
    }
}
