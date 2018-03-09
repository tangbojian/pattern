package com.tbj.pattern.strategy.actualCombat.upgrade2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author bjtang
 * @date   2017年6月19日  
 * @desc   这是我们的总额有效区间注解,可以给策略添加有效区间的设置
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TotalValidRegion {

	//我们引用有效区间注解
	ValiRegion value() default @ValiRegion;
	
}
