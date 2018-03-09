package com.tbj.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

//	private Object source;
//
//	public DynamicProxy(Object source) {
//		super();
//		this.source = source;
//	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("接口的方法全部变成这样了");
		// 这里source是TestClass，但是我们不能使用反射调用它的方法，像下面这样，放开这一行会抛异常
		//return method.invoke(source, args);
		return null;
	}
	
	public static void main(String[] args) {
        //只要你传入就可以强转成功
        TestInterface object =  (TestInterface) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{TestInterface.class}, new DynamicProxy());
        object.method1();
        object.method2();
        object.method3();
    }

}
