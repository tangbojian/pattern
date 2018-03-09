package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;


/**
 * @author bjtang
 * @date   2017��11��10��  
 * @desc   �ڶ��ȼ���VIP,����0.98
 */

@InterestAnnotation(level = "vip2")
public class Vip2CompanyInterestInterface implements InterestInterface{

	
	/***
	 * BigDecimal.ROUND_HALF_UP : ��׼����������
	 */
	@Override
	public BigDecimal getResult(BigDecimal interest) {
		return interest.multiply(new BigDecimal(0.98)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

}
