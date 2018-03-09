package com.tbj.pattern.flyweight;

/**
 * @author bjtang
 * @date 2017年8月7日
 * @desc 测试
 */
public class Client {

	public static void main(String[] args) {

		// 假设有四个solo局，则需要创建四个lion和四个sf
		Lion lion1 = new Lion();
		SF sf1 = new SF();

		Lion lion2 = new Lion();
		SF sf2 = new SF();

		Lion lion3 = new Lion();
		SF sf3 = new SF();

		Lion lion4 = new Lion();
		SF sf4 = new SF();

		/* 以下为释放技能，物理攻击等的打架过程 */

	}

}
