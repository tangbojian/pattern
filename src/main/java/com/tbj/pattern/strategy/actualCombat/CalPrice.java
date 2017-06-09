package com.tbj.pattern.strategy.actualCombat;

/**
 * 
 * @author bjtang
 * @date   2017年6月9日  
 * @desc   返回最终的价格
 */
public interface CalPrice {

	Double  calPrice(Double originPrice);
	
}
