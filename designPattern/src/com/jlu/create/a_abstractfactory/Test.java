package com.jlu.create.a_abstractfactory;

public class Test {
	public static void main(String[] args) {
		
		/**抽象工厂模式：
		 * 
		 * 生成的产品主要看抽象工厂的实现类所要生产的
		 * 即关键看ConcreteFactory1、ConcreteFactory2
		 * 还可以继续扩展接口AbstractFactory的实现类创建其他产品
		 * 所需的其他产品必须实现产品接口，即AbstractProductA和AbstractProductB
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
