package com.tbj.pattern.strategy.actualCombat.upgrade2;

@TotalValidRegion(@ValiRegion(min=3000,order=99))
public class GoldVip implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		// TODO Auto-generated method stub
		return originPrice * 0.5;
	}

}
