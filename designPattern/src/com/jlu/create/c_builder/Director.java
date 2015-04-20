package com.jlu.create.c_builder;

/**
 * 导演角色，负责创建及使用
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
