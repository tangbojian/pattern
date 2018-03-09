package com.tbj.pattern.flyweight;

import org.apache.commons.lang3.StringUtils;

/**
 * @author bjtang
 * @date 2017��8��7��
 * @desc ����Ӣ�ۻ���
 */
public abstract class AbstractHero {

	protected final String name;// Ӣ������
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
				throw new NullPointerException("���ܲ���Ϊ��");
			}
		}
	}
	
	public void releaseSkills(int index){
		if(index < 0){
			index = 0;
		}else if(index > 3){
			index = 3;
		}
		System.out.println(name + "�ͷ�" + skills[index]);
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
