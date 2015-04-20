package com.jlu.structure.d_decorator;

/**
 * 被装饰的类
 * @author pan
 *
 */
public class Son implements Work {
	
	public void paint() {
		System.out.println("儿子用铅笔画好了一副画！");
	}

}
