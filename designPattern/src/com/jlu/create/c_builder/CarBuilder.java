package com.jlu.create.c_builder;
/**
 * ���彨���߽�ɫ��ʵ����ɲ��ֵĹ��������ṩʾ����
 * @author pan
 *
 */
public class CarBuilder implements Builder {

	@Override
	public void part1() {
		System.out.println("��������ǣ�");

	}

	@Override
	public void part2() {
		System.out.println("���췢������");

	}

	@Override
	public Car getCar() {
		return new Car();
	}

}
