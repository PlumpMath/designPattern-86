package com.jlu.structure.f_flyweight;
/**
 * ��Ԫģʽ��
 * @author pan
 *1 һ��ϵͳӦ�õ��˴����Ķ��󣬶��Һܶ඼���ظ��ġ�
�� 2 ���ڴ��������ʹ�ã�����˴洢Ч���ϵĿ�����
�� 3 �����״̬������ⲿ״̬��������״̬����
�� 4 ����޳���Щ�ⲿ״̬��������һ��С��ģ�Ķ����ʾ�������
�����Ŀ�о������ʹ�ó���������һЩ�ļ���ͼ�꣬�����ظ�ʹ�ã�
��ȫ���Բ�������ģʽ�����뻺���У��Ժ�ÿ�ε���ֱ�Ӵӻ����ж�ȡ�����ˡ�
 */
public class Test {
	
	@org.junit.Test
	public void test(){
		
		FlyWeightFactory f=new FlyWeightFactory();
		
		f.factory(1);
		f.factory(2);
		f.factory(3);
		f.factory(3);
		f.factory(4);
		f.factory(4);
		f.factory(5);
		
		f.check();
		
	}

}
