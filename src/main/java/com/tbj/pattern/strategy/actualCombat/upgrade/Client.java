package com.tbj.pattern.strategy.actualCombat.upgrade;

import org.junit.Test;

public class Client {

	@Test
	public void test(){
		Customer customer = new Customer();
		customer.setTotalAmount(500D);
		System.out.println("客户需要付钱: "+ customer.callLastAmount());
		
		
		customer.setTotalAmount(1200D);
		System.out.println("客户需要付钱: "+ customer.callLastAmount());
		
		
		customer.setTotalAmount(1200D);
		System.out.println("客户需要付钱: "+ customer.callLastAmount());
		
		
		customer.setTotalAmount(1200D);
		System.out.println("客户需要付钱: "+ customer.callLastAmount());
	}
	
}
