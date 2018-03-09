package com.tbj.pattern.strategy.actualCombat.upgrade2;

@OnceValidRegion(@ValiRegion(min=2000,order=40))
public class TwotDFourH implements CalPrice{

	@Override
	public Double calPrice(Double originPrice) {
		// TODO Auto-generated method stub
		return originPrice - 400;
	}

}
