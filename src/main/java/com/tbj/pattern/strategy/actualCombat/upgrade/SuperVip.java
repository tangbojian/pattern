package com.tbj.pattern.strategy.actualCombat.upgrade;

@TotalValidRegion(min=2000, max=3000)
public class SuperVip implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		// TODO Auto-generated method stub
		return originPrice * 0.7;
	}

}
