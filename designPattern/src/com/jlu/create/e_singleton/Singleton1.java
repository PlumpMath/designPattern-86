package com.jlu.create.e_singleton;

/**
 * ����ģʽ
 * 
 * @author Administrator
 *
 */
public class Singleton1 {

	private static Singleton1 sl = new Singleton1();

	//˽�й��췽������ֹnew ����ֻ��ͨ������ķ�����ö���
	private Singleton1() {
		
	}

	public static Singleton1 getInstance() {
		return sl;
	}

	
	
}
