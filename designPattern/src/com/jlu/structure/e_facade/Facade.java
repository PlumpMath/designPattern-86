package com.jlu.structure.e_facade;

/**
 * 外观类
 * 这个外观类为子系统提供一个共同的对外接口
 * @author pan
 *
 */
public class Facade {
	public void operaction(){
		ClassA.operationA();
		ClassB.operationB();
	}
	
}
