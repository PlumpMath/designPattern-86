package com.jlu.behavior.b_commond;

public class RightCommond implements Commond {
	private Car car;

	public RightCommond(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		car.turnRight();

	}

}
