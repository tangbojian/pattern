package com.tbj.pattern.strategy.actualCombat.upgrade2;

@TotalValidRegion(value=@ValiRegion(max=1000, order=99))
public class Common implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		// TODO Auto-generated method stub
		return originPrice;
	}

}
