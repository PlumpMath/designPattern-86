package com.jlu.behavior.b_commond;

/**
 * ���������ߣ���������
 * 
 * @author Administrator
 *
 */
public class People {
	private Car car;
	private Commond commond;

	public People(Car car) {
		this.car = car;
	}

	public void left() {
		commond = new LeftCommond(car);
		commond.execute();

	}

	public void right() {
		commond = new RightCommond(car);
		commond.execute();

	}

	public void stop() {
		commond = new StopCommond(car);
		commond.execute();

	}

}
