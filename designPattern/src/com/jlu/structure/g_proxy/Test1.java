package com.jlu.structure.g_proxy;
/**
 * 代理模式：
 * 所谓代理，就是一个人或者机构代表另一个人或者机构采取行动。在一些情况下，
 * 一个客户不想或者不能够直接引用一个对象，
 * 而代理对象可以在客户端和目标对象之间起到中介的作用。
 * @author pan
 *
 *注：AbstractObject、RealObject、ProxyObject用于测试简单代理
 */
public class Test1 {
	@org.junit.Test
	public void test(){
		AbstractObject ao=new ProxyObject();
		ao.operaction();
		
	}

}
