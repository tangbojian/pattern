package com.tbj.pattern.flyweight.updater;

/**
 * @author bjtang
 * @date 2017��8��7��
 * @desc ������
 */
public class Client {

	// �������ĸ�solo�֣���ʹ������Ԫģʽ������£���ʵ��ħ��ʦ��Ӱħ��ʵ������ֻ��һ��
	HeroManager heroManager = HeroManager.getInstance();
	Role role1 = new Role(heroManager.getHero("��ħ��ʦ"));
	Role role2 = new Role(heroManager.getHero("Ӱħ"));

	Role role3 = new Role(heroManager.getHero("��ħ��ʦ"));
	Role role4 = new Role(heroManager.getHero("Ӱħ"));

	Role role5 = new Role(heroManager.getHero("��ħ��ʦ"));
	Role role6 = new Role(heroManager.getHero("Ӱħ"));

	Role role7 = new Role(heroManager.getHero("��ħ��ʦ"));
	Role role8 = new Role(heroManager.getHero("Ӱħ"));

	/* ����Ϊ�ͷż��ܣ��������ȵĴ�ܹ��� */

}
