package com.tbj.pattern.strategy.actualCombat.upgrade2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author bjtang
 * @date   2017��6��19��  
 * @desc   ����������Ե������ѵ���Ч����ע��,���Ը�����������Ч���������
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)																															
public @interface OnceValidRegion {

	//����������Ч����ע��
	ValiRegion value() default @ValiRegion;
	
}