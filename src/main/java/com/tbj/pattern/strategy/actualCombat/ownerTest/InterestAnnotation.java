package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/***
 * @author bjtang
 * @date   2017��11��10��  
 * @desc   �Զ���ȼ�ע��
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InterestAnnotation {

	String level();
	
}
