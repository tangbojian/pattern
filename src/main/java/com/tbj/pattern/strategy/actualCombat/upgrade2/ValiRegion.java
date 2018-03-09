package com.tbj.pattern.strategy.actualCombat.upgrade2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//我们定义一个嵌套注解,定义嵌套注解是为了避免代码的重复，因为单次消费注解和打折注解都是相同的属性.到时候其余两个注解直接引用这个注解就行了.
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValiRegion {

	int max() default Integer.MAX_VALUE;
	int min() default Integer.MIN_VALUE;
	
	//既然可以任意组合,我们就需要给策略定义顺序,就比如刚才说的2000那个例子，是 先打折后返，还是先返后打折。结果就是不一样的
	//所以我们必须支持这一特性, 默认为0， 为最优先.
	
	int order() default 0;
	
}
