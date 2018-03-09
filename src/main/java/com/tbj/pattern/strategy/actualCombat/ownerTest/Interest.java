package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;


/**
 * @author bjtang
 * @date   2017��11��10��  
 * @desc   ��Ϣ�� 
 */
public class Interest {

	public Interest(){
	}
	
	public static BigDecimal calculate(String level, BigDecimal interest) throws InstantiationException, IllegalAccessException{
		return InterestFactory.getInstance().getModel(level).getResult(interest);
	}
	
	
}
