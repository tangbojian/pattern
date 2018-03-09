package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;

/**
 * @author bjtang
 * @date   2017��11��10��  
 * @desc   ��һ�ȼ���VIP,����0.99
 */
@InterestAnnotation(level = "vip1")
public class Vip1CompanyInterestInterface implements InterestInterface {

	@Override
	public BigDecimal getResult(BigDecimal interest) {
		return interest.multiply(new BigDecimal(0.99)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
	

}
