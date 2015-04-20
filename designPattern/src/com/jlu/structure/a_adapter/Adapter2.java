package com.jlu.structure.a_adapter;

/**
 * 对象适配器模式
 * 
 * @author Administrator
 *
 */
public class Adapter2 implements Target {
	@SuppressWarnings("unused")
	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
		adaptee.adapteeOperation(); //直接构造方法中完成了adaptee的操作
	}
	
	@Override
	public void sampleOperation1() {
		System.out.println("我在操作Target目标接口的方法");
	}

	@Override
	public void sampleOperation2() {
		
		System.out.println("我在操作Target目标接口的方法");
	}

}
