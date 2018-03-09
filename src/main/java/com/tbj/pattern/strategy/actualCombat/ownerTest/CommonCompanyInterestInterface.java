package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;


/**
 * @author bjtang
 * @date   2017年11月10日  
 * @desc   没有办理vip的公司,不做任何打折活动
 */
@InterestAnnotation(level = "common")
public class CommonCompanyInterestInterface implements InterestInterface {

	@Override
	public BigDecimal getResult(BigDecimal interest) {
		return interest;
	}

}
