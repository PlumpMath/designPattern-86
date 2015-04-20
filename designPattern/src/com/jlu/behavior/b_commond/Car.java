package com.jlu.behavior.b_commond;
/**
 * 接受者，接受命令者
 * @author Administrator
 *
 */
public class Car {

	public void turnLeft() {
		System.out.println("向左转弯。。。");
	}

	public void turnRight() {

		System.out.println("向右转弯。。。");
	}

	public void stop() {
		System.out.println("停止前进。。。");
	}

}
