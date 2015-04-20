package com.jlu.create.b_factorymethod;

public interface Create {
	//生产产品的工厂，具体生产什么产品由它的实现接口去做
	public Product factory();

}
