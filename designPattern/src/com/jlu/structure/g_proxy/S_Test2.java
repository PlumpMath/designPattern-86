package com.jlu.structure.g_proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

/**
 * 测试动态代理
 * S_HelloWord、S_HelloWordHandle、S_HelloWordImple、S_Test2
 * @author pan
 *
 */
public class S_Test2 {

//	@Test
	public void test() {

		S_HelloWord sh = new S_HelloWordImp();

		S_HelloWordHandle shandle = new S_HelloWordHandle(sh);
		//创建动态代理对象，sh只能传接口
		S_HelloWord proxy=(S_HelloWord)Proxy.newProxyInstance(sh.getClass().getClassLoader(), sh
				.getClass().getInterfaces(), shandle);
		
		proxy.sayA();
		proxy.sayB();

	}
	
	
	
	
}
