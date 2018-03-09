package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;


/**
 * @author bjtang
 * @date   2017年11月10日  
 * @desc   第二等级的VIP,打折0.98
 */

@InterestAnnotation(level = "vip2")
public class Vip2CompanyInterestInterface implements InterestInterface{

	
	/***
	 * BigDecimal.ROUND_HALF_UP : 标准的四舍五入
	 */
	@Override
	public BigDecimal getResult(BigDecimal interest) {
		return interest.multiply(new BigDecimal(0.98)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

}
