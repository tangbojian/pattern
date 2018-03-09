package com.tbj.pattern.strategy.actualCombat.upgrade;

@TotalValidRegion(min=3000)
public class GoldVip implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		// TODO Auto-generated method stub
		return originPrice * 0.5;
	}

}
