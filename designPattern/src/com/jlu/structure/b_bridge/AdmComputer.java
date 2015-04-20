package com.jlu.structure.b_bridge;

public class AdmComputer extends Computer {

	public AdmComputer(AbilityCpu ac) {
		super(ac);
		
	}

	@Override
	public void checkCpu() {
		super.ac.ability();
	}

}
