package com.jlu.structure.d_decorator;

import junit.framework.TestCase;

/**
 * װ��ģʽ�����Ƚ�����˼��ʵ���˹��ܵ���ϣ�����������ģʽ�е�����
 * Ӧ�ó���
����1 �ڲ��������������£�Ϊ����̬�����ĳЩ������
����2 ����һЩ���Գ�����ְ��
����3 ������ʹ����������������ʱ��
 * @author Administrator
 * 
 * 1�� Work.java     �ӿ�
   2�� Son.java      ��װ����-���𻭻�
   3�� Mother.java   װ����-��������ɫ
   4�� Father.java   װ����-����װ����
 *
 */
public class Test{
	
//	@org.junit.Test
	/**
	 * ��������װ�ζ���
	 */
	public void test1(){
		Work wo=new Mother(new Son());
		wo.paint();
	}
	
	/**
	 * ���԰ְ�װ�ζ���
	 */
	@org.junit.Test
	public void test2(){
		Work wo=new Father(new Son());
		wo.paint();
	}

//	@org.junit.Test
	/**
	 * ���԰ְ�װ������Ͷ���
	 */
	public void test3(){
		Work wo=new Father(new Mother(new Son()));
		wo.paint();
	}

}
