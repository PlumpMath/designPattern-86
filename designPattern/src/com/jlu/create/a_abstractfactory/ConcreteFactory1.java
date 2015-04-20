package com.jlu.create.a_abstractfactory;

/**
 * 
 * @author pan
 *提供真正创建对象的实现类，用于组合并创建不同的对象，实现一个产品族。
 *还可以扩展其他的工厂实现类
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
