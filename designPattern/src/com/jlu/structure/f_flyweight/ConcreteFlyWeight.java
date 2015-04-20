package com.jlu.structure.f_flyweight;

public class ConcreteFlyWeight implements FlyWeight {

	private int state;

	public ConcreteFlyWeight(int state) {
		this.state = state;
	}

	public int getState() {
		return state;
	}

}
