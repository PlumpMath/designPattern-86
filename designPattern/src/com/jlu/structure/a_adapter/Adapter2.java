package com.jlu.structure.a_adapter;

/**
 * ����������ģʽ
 * 
 * @author Administrator
 *
 */
public class Adapter2 implements Target {
	@SuppressWarnings("unused")
	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
		adaptee.adapteeOperation(); //ֱ�ӹ��췽���������adaptee�Ĳ���
	}
	
	@Override
	public void sampleOperation1() {
		System.out.println("���ڲ���TargetĿ��ӿڵķ���");
	}

	@Override
	public void sampleOperation2() {
		
		System.out.println("���ڲ���TargetĿ��ӿڵķ���");
	}

}
