package com.tbj.pattern.flyweight.updater;

import org.apache.commons.lang3.StringUtils;

/**
 * @author bjtang
 * @date   2017��8��7��  
 * @desc   ����Ӣ����
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
	
	
}
