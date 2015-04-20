package com.jlu.create.e_singleton;

/**
 * 饿汉模式
 * 
 * @author Administrator
 *
 */
public class Singleton1 {

	private static Singleton1 sl = new Singleton1();

	//私有构造方法，防止new 对象，只能通过下面的方法获得对象
	private Singleton1() {
		
	}

	public static Singleton1 getInstance() {
		return sl;
	}

	
	
}
