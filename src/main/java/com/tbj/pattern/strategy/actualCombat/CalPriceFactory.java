package com.tbj.pattern.strategy.actualCombat;

/**
 * 
 * @author bjtang
 * @date 2017年6月9日
 * @desc 返回最后价格的工厂类 ,根据传进来的价格,判断使用那个具体的类
 */
public class CalPriceFactory {

	private CalPriceFactory() {
	}

	public static CalPrice createCalPrice(Customer customer) {
		if (customer.getTotalAmount() > 3000) {
			return new GoldVip();
		} else if (customer.getTotalAmount() > 2000) {
			return new SuperVip();
		} else if (customer.getTotalAmount() > 1000) {
			return new Vip();
		} else {
			return new Common();
		}
	}

}
