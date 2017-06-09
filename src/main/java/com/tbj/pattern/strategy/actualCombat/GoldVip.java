package com.tbj.pattern.strategy.actualCombat;

public class GoldVip implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		// TODO Auto-generated method stub
		return originPrice * 0.5;
	}

}
