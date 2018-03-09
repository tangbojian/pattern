package com.tbj.pattern.strategy.actualCombat.upgrade;

@TotalValidRegion(min=1000, max=2000)
public class Vip implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		return originPrice * 0.8;
	}

}
