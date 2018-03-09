package com.tbj.pattern.memento.updater;

public class Client {

	public static void main(String[] args) {
		
		Person personA = new Person("��������ԱA");
		Person personB = new Person("��������ԱB");
		
		//��������ԱA�ļ���
		personA.addStore("��Сʱ��͵���ϱ�ץ��;");
		personA.addStore("���е�ʱ���ҳɼ��ر��;");
		
		//��������ԱB�ļ���
		personB.addStore("Сʱ�������˸�С����;");
		personB.addStore("�Ҹ��гɼ��ȽϺ�;");
		
		//��ȡ��ǰʱ�̿���Ա��A�Ϳ�����ԱB�ļ���
		Soul.getMember(personA);
		Soul.getMember(personB);
		
		//�����˹�ͬ�ļ���
		personA.addStore("�ҽ��쿴����һ����ɵ���,���ҿ���������ĳ���;");
		personB.addStore("�ҽ��쿴����һ����ɵ���,���ҿ���������ĳ���;");
		
		Soul.forceFixMember(personA);
		Soul.forceFixMember(personB);
		System.out.println(personA);
		System.out.println(personB);
		
	}
	
}
