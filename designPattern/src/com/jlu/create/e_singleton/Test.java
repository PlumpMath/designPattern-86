package com.jlu.create.e_singleton;

public class Test {
/**
 * 单例模式
 * @param args
 */
	public static void main(String[] args) {
		
		
		Singleton1 s1=Singleton1.getInstance();
		Singleton1 s2=Singleton1.getInstance();
		
		if(s1==s2){
			System.out.println("创建的是同一个对象！");
		}else{
			System.out.println("创建的不是同一对象！");
		}
	   
		System.out.println(s1);
		System.out.println(s2);
		
		
		//懒汉模式在此就不进行测试了。

	}

}
