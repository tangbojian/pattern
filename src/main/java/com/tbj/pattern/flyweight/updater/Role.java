package com.tbj.pattern.flyweight.updater;

/**
 * @author bjtang
 * @date 2017年8月7日
 * @desc 用于组合英雄内部状态和外部状态的类，假设称之为角色
 */
public class Role {

	private AbstractHero hero;
	
	public Role(AbstractHero hero){
		super();
		this.hero = hero;
	}
	
	/**释放技能**/
	public void release(int index){
		hero.releaseSkills(index);
	}

	private long hp;
	private long mp;

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
