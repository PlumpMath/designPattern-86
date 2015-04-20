package com.jlu.create.c_builder;
/**
 * 具体建造者角色，实现组成部分的构建，并提供示例。
 * @author pan
 *
 */
public class CarBuilder implements Builder {

	@Override
	public void part1() {
		System.out.println("建造引擎盖！");

	}

	@Override
	public void part2() {
		System.out.println("建造发动机！");

	}

	@Override
	public Car getCar() {
		return new Car();
	}

}
