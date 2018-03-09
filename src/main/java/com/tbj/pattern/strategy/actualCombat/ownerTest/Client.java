package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;

public class Client {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		BigDecimal interest = new BigDecimal(10001);
		
		String level = "vip3";
		
//		InterestInterface interestInterface = new CommonCompanyInterestInterface();
		
		
		/***
		 * ��һ���if else�� ʹ�ü򵥹���ģʽ���и���
		 */
//		if(level == "common"){
//			System.out.print("��Ҫ��������ϢΪ   = ");
//			BigDecimal result = interestInterface.getResult(interest);
//			System.out.println(result);
//		} else if(level == "vip1"){
//			System.out.print("��Ҫ��������ϢΪ   = ");
//			interestInterface = new Vip1CompanyInterestInterface();
//			BigDecimal result = interestInterface.getResult(interest);
//			System.out.println(result);
//		} else if(level == "vip2"){
//			System.out.print("��Ҫ��������ϢΪ   = ");
//			interestInterface = new Vip2CompanyInterestInterface();
//			BigDecimal result = interestInterface.getResult(interest);
//			System.out.println(result);
//		} else if(level == "vip3"){
//			System.out.print("��Ҫ��������ϢΪ   = ");
//			interestInterface = new Vip3CompanyInterestInterface();
//			BigDecimal result = interestInterface.getResult(interest);
//			System.out.println(result);
//		} else {
//			System.out.println("��������");
//		}
		
		
		/**
		 * ��Ȼ���������Ѿ������ĵ�if else �Ƴ�ȥ�ˣ������ڼ򵥹����л����ж����˵�if else������ܳ���������Щ if else �ĺ���֮���ˣ� ������ʹ��ע�⣬�ڽ��з�������ȡ��Ҫ����.
		 */
		InterestInterface interestInterface = InterestFactory.get(level);
		BigDecimal result = interestInterface.getResult(interest);
		System.out.println("��Ҫ��������ϢΪ = " + result);
		
		
		
		//�޸�֮��Ĵ���
		Interest interest2 = new Interest();
		BigDecimal calculate = interest2.calculate("vip3", new BigDecimal(10001));
		System.out.println("annotation : " + calculate);
		
	}
	
	
}
