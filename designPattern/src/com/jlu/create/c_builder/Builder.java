package com.jlu.create.c_builder;

/**
 * 建造一辆汽车
 * 抽象建造者接口，规范各个组成部分的构建。
 * @author pan
 *
 */
public interface Builder {
	
	public void part1();
	public void part2();
	public Car getCar();

}
