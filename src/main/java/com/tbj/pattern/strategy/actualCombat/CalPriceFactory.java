package com.tbj.pattern.strategy.actualCombat;

/**
 * 
 * @author bjtang
 * @date 2017��6��9��
 * @desc �������۸�Ĺ����� ,���ݴ������ļ۸�,�ж�ʹ���Ǹ��������
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
