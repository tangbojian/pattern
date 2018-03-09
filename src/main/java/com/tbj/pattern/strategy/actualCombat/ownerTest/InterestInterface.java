package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.math.BigDecimal;

/***
 * @author bjtang
 * @date   2017年11月10日  
 * @desc   计算利息的接口 ,根据不同的VIP等级,得到不同的打折结果
 */
public interface InterestInterface {

	public BigDecimal getResult(BigDecimal interest);
	
}
