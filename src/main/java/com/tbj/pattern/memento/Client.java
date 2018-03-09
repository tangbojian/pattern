package com.tbj.pattern.memento;

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
		
		System.out.println(personA);
		System.out.println(personB);
		
		//�����˹�ͬ�ļ���
		personA.addStore("�ҽ��쿴����һ����ɵ���,���ҿ���������ĳ���;");
		personB.addStore("�ҽ��쿴����һ����ɵ���,���ҿ���������ĳ���;");
		
		System.out.println(personA);
		System.out.println(personB);
		
	}
	
}
