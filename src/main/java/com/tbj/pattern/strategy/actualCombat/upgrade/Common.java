package com.tbj.pattern.strategy.actualCombat.upgrade;

@TotalValidRegion(max=1000)
public class Common implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		// TODO Auto-generated method stub
		return originPrice;
	}

}
