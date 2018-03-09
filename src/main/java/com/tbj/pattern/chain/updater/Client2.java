package com.tbj.pattern.chain.updater;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bjtang
 * @date 2017��8��10��
 * @desc ����
 */
public class Client2 {

	public static void main(String[] args) {
		// �����ʼ�˵�����������Щ����
		Map<String, Integer> menu = new HashMap<String, Integer>();
		menu.put("����", 5);
		menu.put("����", 5);
		menu.put("����", 5);
		menu.put("ѩ��", 5);
		// ������5���ֵ�
		Subbranch mcSubbranch1 = new McSubbranch(0, 0,
				new HashMap<String, Integer>(menu));
		Subbranch mcSubbranch2 = new McSubbranch(100, 120,
				new HashMap<String, Integer>(menu));
		Subbranch mcSubbranch3 = new McSubbranch(-100, -120,
				new HashMap<String, Integer>(menu));
		Subbranch mcSubbranch4 = new McSubbranch(1000, 20,
				new HashMap<String, Integer>(menu));
		Subbranch mcSubbranch5 = new McSubbranch(-500, 0,
				new HashMap<String, Integer>(menu));

		// ע��5���ֵ�
		OrderManager.getInstance().registerSubbranch(mcSubbranch1)
								  .registerSubbranch(mcSubbranch2)
								  .registerSubbranch(mcSubbranch3)
								  .registerSubbranch(mcSubbranch4)
								  .registerSubbranch(mcSubbranch5);

		// С��ʼ���ͣ�����С���������900,20
		Map<String, Integer> order = new HashMap<String, Integer>();
		order.put("����", 2);
		order.put("����", 1);
		order.put("����", 1);

		print(mcSubbranch1);
		System.out.println("------------------------------------------");

		// С��ʼ���ͣ�ֱ���Ҷ��͹����Ŷ���
		OrderManager.getInstance().handleOrder(new Order(900, 20, order));

		System.out.println("------------------------------------------");
		print(mcSubbranch1);
	}

	public static void print(Subbranch subbranch) {
		if (subbranch == null) {
			return;
		}
		do {
			if (subbranch instanceof McSubbranch) {
				System.out.println("[" + subbranch + "]�Ĳ˵�:"
						+ ((McSubbranch) subbranch).getMenu());
			}
		} while ((subbranch = ((McSubbranch) subbranch).getNextSubbranch()) != null);
	}

}
