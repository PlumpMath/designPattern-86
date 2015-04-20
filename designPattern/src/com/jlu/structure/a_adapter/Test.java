package com.jlu.structure.a_adapter;
/**
 * 适配器模式
 * @author Administrator
 * 使用场景：
   * 　1 想使用一个已经存在的类，但是它的接口并不符合要求

　　2 想创建一个可以复用的类，这个类与其他的类可以协同工作

　　3 想使用已经存在的子类，但是不可能对每个子类都匹配他们的接口。
                因此对象适配器可以适配它的父类接口。（适配即implement父类接口）
                
           适配器的作用是将两个不相关的结合在一起工作（一个是类，一个是接口），适配器必须是一个具体的类，
 *  本例中Target是接口，Adaptee是类，利用Adapter适配器将他们俩结合工作。Adapter1为类适配器模式
 *  Adapter2为对象适配器模式。
 *  
 *  类适配器模式时，Adapter继承Adaptee，实现Target接口。
 *  对象适配器模式时，Adapter实现Target接口，并在适配器中的构造方法中传入一个Adaptee对象。
 */
public class Test {

	public static void main(String[] args) {
		
		//类适配器测试
		Adapter1 ap1=new Adapter1();
		ap1.adapteeOperation();
		ap1.sampleOperation1();
		ap1.sampleOperation1();
		
		//对象适配器测试
		
		Adapter2 ap2=new Adapter2(new Adaptee());
        ap2.sampleOperation1();
        ap2.sampleOperation2();
		
	}

}
