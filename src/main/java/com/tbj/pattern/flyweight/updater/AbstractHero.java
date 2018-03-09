package com.tbj.pattern.flyweight.updater;

import org.apache.commons.lang3.StringUtils;

/**
 * @author bjtang
 * @date   2017年8月7日  
 * @desc   抽象英雄类
 */
public abstract class AbstractHero {

	protected final String name;
	protected final String[] skills = new String[4];
	
	public AbstractHero(){
		super();
		this.name = getName();
		checkSkills();
		initSkills();
	}
	
	private void checkSkills(){
		for(String skill : skills){
			if(StringUtils.isEmpty(skill)){
				throw new NullPointerException("技能不能为空");
			}
		}
	}
	
	public void releaseSkills(int index){
		if(index < 0){
			index = 0;
		}else if(index > 3){
			index = 3;
		}
		System.out.println(name + "释放" + skills[index]);
	}
	
	public abstract String getName();
	
	public abstract void initSkills();
	
	
}
