package com.jlu.structure.a_adapter;
/**
 * ������ģʽ
 * @author Administrator
 * ʹ�ó�����
   * ��1 ��ʹ��һ���Ѿ����ڵ��࣬�������Ľӿڲ�������Ҫ��

����2 �봴��һ�����Ը��õ��࣬������������������Эͬ����

����3 ��ʹ���Ѿ����ڵ����࣬���ǲ����ܶ�ÿ�����඼ƥ�����ǵĽӿڡ�
                ��˶��������������������ĸ���ӿڡ������伴implement����ӿڣ�
                
           �������������ǽ���������صĽ����һ������һ�����࣬һ���ǽӿڣ���������������һ��������࣬
 *  ������Target�ǽӿڣ�Adaptee���࣬����Adapter����������������Ϲ�����Adapter1Ϊ��������ģʽ
 *  Adapter2Ϊ����������ģʽ��
 *  
 *  ��������ģʽʱ��Adapter�̳�Adaptee��ʵ��Target�ӿڡ�
 *  ����������ģʽʱ��Adapterʵ��Target�ӿڣ������������еĹ��췽���д���һ��Adaptee����
 */
public class Test {

	public static void main(String[] args) {
		
		//������������
		Adapter1 ap1=new Adapter1();
		ap1.adapteeOperation();
		ap1.sampleOperation1();
		ap1.sampleOperation1();
		
		//��������������
		
		Adapter2 ap2=new Adapter2(new Adaptee());
        ap2.sampleOperation1();
        ap2.sampleOperation2();
		
	}

}
