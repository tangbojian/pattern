package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;

public class Client {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		BigDecimal interest = new BigDecimal(10001);
		
		String level = "vip3";
		
//		InterestInterface interestInterface = new CommonCompanyInterestInterface();
		
		
		/***
		 * 这一快的if else， 使用简单工厂模式进行改造
		 */
//		if(level == "common"){
//			System.out.print("需要偿还的利息为   = ");
//			BigDecimal result = interestInterface.getResult(interest);
//			System.out.println(result);
//		} else if(level == "vip1"){
//			System.out.print("需要偿还的利息为   = ");
//			interestInterface = new Vip1CompanyInterestInterface();
//			BigDecimal result = interestInterface.getResult(interest);
//			System.out.println(result);
//		} else if(level == "vip2"){
//			System.out.print("需要偿还的利息为   = ");
//			interestInterface = new Vip2CompanyInterestInterface();
//			BigDecimal result = interestInterface.getResult(interest);
//			System.out.println(result);
//		} else if(level == "vip3"){
//			System.out.print("需要偿还的利息为   = ");
//			interestInterface = new Vip3CompanyInterestInterface();
//			BigDecimal result = interestInterface.getResult(interest);
//			System.out.println(result);
//		} else {
//			System.out.println("参数错误");
//		}
		
		
		/**
		 * 虽然我们现在已经将恶心的if else 移出去了，但是在简单工厂中还是有恶心人的if else，如果能彻底消除这些 if else 的害人之虫了， 我们来使用注解，在进行反射来获取需要的类.
		 */
		InterestInterface interestInterface = InterestFactory.get(level);
		BigDecimal result = interestInterface.getResult(interest);
		System.out.println("需要偿还的利息为 = " + result);
		
		
		
		//修改之后的代码
		Interest interest2 = new Interest();
		BigDecimal calculate = interest2.calculate("vip3", new BigDecimal(10001));
		System.out.println("annotation : " + calculate);
		
	}
	
	
}
