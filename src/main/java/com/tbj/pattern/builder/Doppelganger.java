package com.tbj.pattern.builder;

/**
 * @author bjtang
 * @date 2017年7月24日
 * @desc 分身类
 */
public class Doppelganger {

	private String name;

	private String body;

	private String head;

	private String leftArm;

	private String leftHand;

	private String rightArm;

	private String rightHand;

	private String leftFoot;

	private String leftLeg;

	private String rightFoot;

	private String rightLeg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getLeftArm() {
		return leftArm;
	}

	public void setLeftArm(String leftArm) {
		this.leftArm = leftArm;
	}

	public String getLeftHand() {
		return leftHand;
	}

	public void setLeftHand(String leftHand) {
		this.leftHand = leftHand;
	}

	public String getRightArm() {
		return rightArm;
	}

	public void setRightArm(String rightArm) {
		this.rightArm = rightArm;
	}

	public String getRightHand() {
		return rightHand;
	}

	public void setRightHand(String rightHand) {
		this.rightHand = rightHand;
	}

	public String getLeftFoot() {
		return leftFoot;
	}

	public void setLeftFoot(String leftFoot) {
		this.leftFoot = leftFoot;
	}

	public String getLeftLeg() {
		return leftLeg;
	}

	public void setLeftLeg(String leftLeg) {
		this.leftLeg = leftLeg;
	}

	public String getRightFoot() {
		return rightFoot;
	}

	public void setRightFoot(String rightFoot) {
		this.rightFoot = rightFoot;
	}

	public String getRightLeg() {
		return rightLeg;
	}

	public void setRightLeg(String rightLeg) {
		this.rightLeg = rightLeg;
	}

	public Doppelganger(String name) {
		super();
		this.name = name;
	}

	public Doppelganger() {
		super();
	}

	@Override
	public String toString() {
		return "Doppelganger [name=" + name + ", body=" + body + ", head="
				+ head + ", leftArm=" + leftArm + ", leftHand=" + leftHand
				+ ", rightArm=" + rightArm + ", rightHand=" + rightHand
				+ ", leftFoot=" + leftFoot + ", leftLeg=" + leftLeg
				+ ", rightFoot=" + rightFoot + ", rightLeg=" + rightLeg + "]";
	}

}
