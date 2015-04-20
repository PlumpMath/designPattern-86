package com.jlu.behavior.b_commond;

public class StopCommond implements Commond {
	private Car car;

	public StopCommond(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		car.stop();

	}

}
