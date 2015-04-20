package com.jlu.structure.g_proxy;

/**
 * 代理类
 * 在代理类中传入将要被代理的对象
 * 
 * @author pan
 *
 */
public class ProxyObject implements AbstractObject {

	private RealObject re=new RealObject();
	public void operaction() {
		//操作原对象前可以做一些操作
		re.operaction();
        //操作原对象后可以做一些操作
	}

}
