package com.tbj.pattern.flyweight.updater;

/**
 * @author bjtang
 * @date 2017��8��7��
 * @desc �������Ӣ���ڲ�״̬���ⲿ״̬���࣬�����֮Ϊ��ɫ
 */
public class Role {

	private AbstractHero hero;
	
	public Role(AbstractHero hero){
		super();
		this.hero = hero;
	}
	
	/**�ͷż���**/
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
