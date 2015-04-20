package com.jlu.structure.b_bridge;

public abstract class Computer {

	public AbilityCpu ac = null;

	public Computer(AbilityCpu ac) {
		this.ac = ac;
	}
	public abstract void checkCpu();

}
