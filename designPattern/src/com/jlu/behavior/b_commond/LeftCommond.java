package com.jlu.behavior.b_commond;

public class LeftCommond implements Commond {

	private Car car;
	
	public LeftCommond(Car car) {
		this.car = car;
	}

	public void execute() {
		car.turnLeft();
	}

}
