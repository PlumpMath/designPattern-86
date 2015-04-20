package com.jlu.create.a_abstractfactory;

public class Test {
	public static void main(String[] args) {
		
		/**���󹤳�ģʽ��
		 * 
		 * ���ɵĲ�Ʒ��Ҫ�����󹤳���ʵ������Ҫ������
		 * ���ؼ���ConcreteFactory1��ConcreteFactory2
		 * �����Լ�����չ�ӿ�AbstractFactory��ʵ���ഴ��������Ʒ
		 * �����������Ʒ����ʵ�ֲ�Ʒ�ӿڣ���AbstractProductA��AbstractProductB
		 */
		
		AbstractProductA apa;
		AbstractProductB apb;
		
		
		AbstractFactory factory=new ConcreteFactory1();
		apa=factory.createProductA();
		apb=factory.createProductB();
		apa.use();
		apb.use();
		
		AbstractFactory factory2=new ConcreteFactory2();
		apa=factory2.createProductA();
		apb=factory2.createProductB();
		apa.use();
		apb.use();
		
	}

}
