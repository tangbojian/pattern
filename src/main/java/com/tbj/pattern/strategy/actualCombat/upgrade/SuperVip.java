package com.tbj.pattern.strategy.actualCombat.upgrade;

public class SuperVip implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		// TODO Auto-generated method stub
		return originPrice * 0.7;
	}

}
