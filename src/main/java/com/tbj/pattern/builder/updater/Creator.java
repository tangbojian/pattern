package com.tbj.pattern.builder.updater;

/**
 * @author bjtang
 * @date   2017��7��25��  
 * @desc   ������� 
 */
public class Creator {

	public static void main(String[] args) {
		/**
		 * ����һ�����ݵĿ���Ա
		 */
		Soul soul = new Soul();
		Doppelganger model = soul.createDoppleganger(new ThinBuilder(), "��������Ա1");
		System.out.println(model);
		
		
		/**
		 * ����һ�����ֵĿ���Ա
		 */
		model = soul.createDoppleganger(new FatBuilder(), "��������Ա2");
		System.out.println(model);
	}
	
}
