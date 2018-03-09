package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;

/**
 * @author bjtang
 * @date   2017年11月10日  
 * @desc   第一等级的VIP,打折0.99
 */
@InterestAnnotation(level = "vip1")
public class Vip1CompanyInterestInterface implements InterestInterface {

	@Override
	public BigDecimal getResult(BigDecimal interest) {
		return interest.multiply(new BigDecimal(0.99)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
	

}
