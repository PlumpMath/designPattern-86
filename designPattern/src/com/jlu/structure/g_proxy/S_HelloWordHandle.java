package com.jlu.structure.g_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * @author pan
 *
 */
public class S_HelloWordHandle implements InvocationHandler {

	private Object obj;//传入要代理的对象

	public S_HelloWordHandle(Object obj) {
		this.obj = obj;
	}

	//代理实现了调用原对象的方法。
	//这个方法一定会执行。
	public Object invoke(Object proxy, Method method, Object[] arg)
			throws Throwable {

		Object result;
		//调用前做一些事情
		System.out.println("before");
		result = method.invoke(obj, arg);
		//调用后做一些事情
		System.out.println("after");
		return result;
	}
	

	
}
