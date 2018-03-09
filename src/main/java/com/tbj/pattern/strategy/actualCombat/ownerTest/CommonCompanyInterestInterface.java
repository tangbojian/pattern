package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;


/**
 * @author bjtang
 * @date   2017��11��10��  
 * @desc   û�а���vip�Ĺ�˾,�����κδ��ۻ
 */
@InterestAnnotation(level = "common")
public class CommonCompanyInterestInterface implements InterestInterface {

	@Override
	public BigDecimal getResult(BigDecimal interest) {
		return interest;
	}

}
