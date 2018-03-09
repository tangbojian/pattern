package com.tbj.pattern.flyweight;

import org.apache.commons.lang3.StringUtils;

/**
 * @author bjtang
 * @date 2017年8月7日
 * @desc 抽象英雄基类
 */
public abstract class AbstractHero {

	protected final String name;// 英雄名称
	protected final String[] skills = new String[4];
	protected long hp;
	private long mp;
	
	public AbstractHero(){
		super();
		this.name = getName();
		initSkills();
		checkSkills();
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

	public long getHp() {
		return hp;
	}

	public void setHp(long hp) {
		this.hp = hp;
	}

	public long getMp() {
		return mp;
	}

	public void setMp(long mp) {
		this.mp = mp;
	}

}
