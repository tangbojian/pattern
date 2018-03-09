package com.tbj.pattern.strategy.actualCombat.upgrade2;

@TotalValidRegion(@ValiRegion(min=1000,max=2000,order=99))
public class Vip implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		return originPrice * 0.8;
	}

}
