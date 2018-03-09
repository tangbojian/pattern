package com.tbj.pattern.bridge.updater;

/**
 * @author bjtang
 * @date 2017��7��24��
 * @desc ������
 */
public abstract class Soul {

	/** ��ò **/
	protected Appearance appearance;

	/** ���� **/
	protected Skills skills;
	
	/**
	 * �����ʵ�ֽ���ʵ�ֲ������
	 */
	public void show(){
		appearance.show();
	}

	/**
	 * �����ʵ�ֽ���ʵ�ֲ������
	 */
	public void releaseSkills() {
		skills.releasSkills();
	}

	public void createDoppelganger() {
		System.out.println("��������");
	}

	/**
	 * ����ķ�����������ʵ��
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
