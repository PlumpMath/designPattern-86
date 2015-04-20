package com.jlu.create.a_abstractfactory;

/**
 * 
 * @author pan
 *�ṩ�������������ʵ���࣬������ϲ�������ͬ�Ķ���ʵ��һ����Ʒ�塣
 *��������չ�����Ĺ���ʵ����
 */
public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
