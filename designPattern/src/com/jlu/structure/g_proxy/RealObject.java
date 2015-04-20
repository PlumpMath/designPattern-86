package com.jlu.structure.g_proxy;
/**
 * 原对象，即将要被代理的对象
 * @author pan
 *
 */
public class RealObject implements AbstractObject {

	@Override
	public void operaction() {
		
		System.out.println("我要被代理对象操作");

	}

}
