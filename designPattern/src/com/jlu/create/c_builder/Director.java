package com.jlu.create.c_builder;

/**
 * ���ݽ�ɫ�����𴴽���ʹ��
 * 
 * @author pan
 *
 */
public class Director {
	private Builder bl;
	public Car createCar() {
		bl = new CarBuilder();
		bl.part1();
		bl.part2();
		Car car = bl.getCar();
		return car;
	}

}
