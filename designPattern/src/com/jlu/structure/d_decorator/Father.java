package com.jlu.structure.d_decorator;

public class Father implements Work {

	private Work wo;
	
	public Father(Work wo) {
		this.wo = wo;
	}

	public void paint() {
		System.out.println("爸爸准备给儿子的画上画框！");
		wo.paint();
		System.out.println("爸爸为儿子的画上好了画框！");

	}

}
