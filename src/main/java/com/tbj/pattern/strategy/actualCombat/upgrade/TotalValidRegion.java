package com.tbj.pattern.strategy.actualCombat.upgrade;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author bjtang
 * @date   2017年6月9日  
 * @desc   这是我们的有效区间注解,可以给给策略添加有效区间的设置
 * 用来记录每个策略的生效区间
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TotalValidRegion {

	int max() default Integer.MAX_VALUE;
	int min() default Integer.MIN_VALUE;
	
	
}
