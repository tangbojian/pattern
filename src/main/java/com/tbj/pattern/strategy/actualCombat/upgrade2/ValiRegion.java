package com.tbj.pattern.strategy.actualCombat.upgrade2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//���Ƕ���һ��Ƕ��ע��,����Ƕ��ע����Ϊ�˱��������ظ�����Ϊ��������ע��ʹ���ע�ⶼ����ͬ������.��ʱ����������ע��ֱ���������ע�������.
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValiRegion {

	int max() default Integer.MAX_VALUE;
	int min() default Integer.MIN_VALUE;
	
	//��Ȼ�����������,���Ǿ���Ҫ�����Զ���˳��,�ͱ���ղ�˵��2000�Ǹ����ӣ��� �ȴ��ۺ󷵣������ȷ�����ۡ�������ǲ�һ����
	//�������Ǳ���֧����һ����, Ĭ��Ϊ0�� Ϊ������.
	
	int order() default 0;
	
}
