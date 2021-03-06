package com.tbj.pattern.bridge.updater;

/**
 * @author bjtang
 * @date 2017年7月24日
 * @desc 灵魂基类
 */
public abstract class Soul {

	/** 外貌 **/
	protected Appearance appearance;

	/** 技能 **/
	protected Skills skills;
	
	/**
	 * 具体的实现交给实现部分完成
	 */
	public void show(){
		appearance.show();
	}

	/**
	 * 具体的实现交给实现部分完成
	 */
	public void releaseSkills() {
		skills.releasSkills();
	}

	public void createDoppelganger() {
		System.out.println("制作分身");
	}

	/**
	 * 抽象的方法留给分身实现
	 */
	public abstract void doAllLikePeople();

	public Soul() {
		super();
	}

	public Soul(Skills skills) {
		super();
		this.skills = skills;
	}

	public Soul(Appearance appearance, Skills skills) {
		super();
		this.appearance = appearance;
		this.skills = skills;
	}

	public Appearance getAppearance() {
		return appearance;
	}

	public void setAppearance(Appearance appearance) {
		this.appearance = appearance;
	}

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

}
