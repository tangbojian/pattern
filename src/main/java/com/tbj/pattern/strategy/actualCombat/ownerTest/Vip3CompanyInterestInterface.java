package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;


/**
 * @author bjtang
 * @date   2017年11月10日  
 * @desc   第三等级的VIP,打折0.97
 */

@InterestAnnotation(level = "vip3")
public class Vip3CompanyInterestInterface implements InterestInterface {

	@Override
	public BigDecimal getResult(BigDecimal interest) {
		return interest.multiply(new BigDecimal(0.97)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

}
