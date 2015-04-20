package com.jlu.structure.b_bridge;

public class IntelComputer extends Computer {

	public IntelComputer(AbilityCpu ac) {
		super(ac);
	}

	@Override
	public void checkCpu() {
		super.ac.ability();

	}

}
