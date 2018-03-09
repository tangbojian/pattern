package com.tbj.pattern.bridge.updater;

/**
 * @author bjtang
 * @date   2017年7月24日  
 * @desc   分身类
 */
public class Doppelganger extends Soul {
	
	public Doppelganger(){
		System.out.println("制作一个暂无外貌和技能的分身");
	}

	@Override
	public void doAllLikePeople() {
		System.out.println("分身可以像正常人一样做任何事情");
	}

}
