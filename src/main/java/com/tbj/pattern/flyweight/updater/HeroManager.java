package com.tbj.pattern.flyweight.updater;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bjtang
 * @date 2017��8��7��
 * @desc �ṩ������,����
 */
public class HeroManager {

	private static HeroManager heroManager = new HeroManager();

	private Map<String, AbstractHero> heroMap;

	private HeroManager() {
		heroMap = new HashMap<>();
	}

	public static HeroManager getInstance() {
		return heroManager;
	}

	// �÷����ṩ������
	public AbstractHero getHero(String name) {
		AbstractHero hero = heroMap.get(name);
		if (hero == null) {
			if (name.equals("��ħ��ʦ")) {
				hero = new Lion();
			} else if (name.equals("Ӱħ")) {
				hero = new SF();
			}
			heroMap.put(name, hero);
		}
		return hero;
	}
}
