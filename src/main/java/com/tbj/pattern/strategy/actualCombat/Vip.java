package com.tbj.pattern.strategy.actualCombat;

public class Vip implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		return originPrice * 0.8;
	}

}
