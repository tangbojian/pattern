package com.tbj.pattern.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> forName = Class.forName("com.tbj.pattern.proxy.People");
		
		Method[] methods = forName.getDeclaredMethods();
		
		for(Method method : methods){
			System.out.println(method.getClass());
			System.out.println(method.getName());
			Class<?> declaringClass = method.getDeclaringClass();
			System.out.println(declaringClass);
			method.invoke(new Object());
		}
		
	}
	
}
