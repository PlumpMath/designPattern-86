package com.jlu.create.e_singleton;

public class Test {
/**
 * ����ģʽ
 * @param args
 */
	public static void main(String[] args) {
		
		
		Singleton1 s1=Singleton1.getInstance();
		Singleton1 s2=Singleton1.getInstance();
		
		if(s1==s2){
			System.out.println("��������ͬһ������");
		}else{
			System.out.println("�����Ĳ���ͬһ����");
		}
	   
		System.out.println(s1);
		System.out.println(s2);
		
		
		//����ģʽ�ڴ˾Ͳ����в����ˡ�

	}

}
