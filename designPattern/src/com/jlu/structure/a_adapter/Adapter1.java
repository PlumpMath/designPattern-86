package com.jlu.structure.a_adapter;

/**
 * 类适配器模式
 * @author Administrator
 *
 */
public class Adapter1 extends Adaptee implements Target{

	/**
	 * 已经继承Adaptee，可以操作Adaptee的方法行为。
	 */
	//目标接口要实现的方法
	public void sampleOperation1() {
	     System.out.println("我在操作Target目标接口的方法");
	}

	//目标接口要实现的方法
	public void sampleOperation2() {
		System.out.println("我在操作Target目标接口的方法");
	}

}
