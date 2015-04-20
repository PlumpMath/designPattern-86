package com.jlu.create.a_abstractfactory;

/**
 * 
 * @author pan
 *提供创建对象的接口
 */
public interface AbstractFactory {
	
	public AbstractProductA createProductA();
	public AbstractProductB createProductB();
	
}
