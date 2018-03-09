package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/***
 * @author bjtang
 * @date   2017年11月10日  
 * @desc   自定义等级注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InterestAnnotation {

	String level();
	
}
