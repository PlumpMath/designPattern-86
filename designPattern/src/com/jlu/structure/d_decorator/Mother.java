package com.jlu.structure.d_decorator;

/**
 * 装饰者妈妈
 * @author pan
 *
 */
public class Mother implements Work {

	private Work wo;
	public Mother(Work wo) {
		this.wo = wo;
	}

	public void paint() {
		System.out.println("妈妈准备给儿子的画上颜色！");
		wo.paint();
		System.out.println("妈妈为儿子的画上好颜色了！");
   
	}

}
