package com.jlu.structure.a_adapter;

/**
 * ��������ģʽ
 * @author Administrator
 *
 */
public class Adapter1 extends Adaptee implements Target{

	/**
	 * �Ѿ��̳�Adaptee�����Բ���Adaptee�ķ�����Ϊ��
	 */
	//Ŀ��ӿ�Ҫʵ�ֵķ���
	public void sampleOperation1() {
	     System.out.println("���ڲ���TargetĿ��ӿڵķ���");
	}

	//Ŀ��ӿ�Ҫʵ�ֵķ���
	public void sampleOperation2() {
		System.out.println("���ڲ���TargetĿ��ӿڵķ���");
	}

}
