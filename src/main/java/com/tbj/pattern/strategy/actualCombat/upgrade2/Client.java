package com.tbj.pattern.strategy.actualCombat.upgrade2;

public class Client {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy(500D);
		System.out.println("�ͻ���Ҫ��Ǯ��" + customer.calLastAmount());
		customer.buy(1200D);
		System.out.println("�ͻ���Ҫ��Ǯ��" + customer.calLastAmount());
		customer.buy(1200D);
		System.out.println("�ͻ���Ҫ��Ǯ��" + customer.calLastAmount());
		customer.buy(1200D);
		System.out.println("�ͻ���Ҫ��Ǯ��" + customer.calLastAmount());
		customer.buy(2600D);
		System.out.println("�ͻ���Ҫ��Ǯ��" + customer.calLastAmount());
	}

}
