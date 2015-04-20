package com.jlu.behavior.b_commond;

/**
 * 命令模式： 这里举一个由人命令汽车工作的实例
 * People是命令请求者
 * Car是命令接受者
 * Commond是命令
 * 
 * @author Administrator
 *
 */
public class Test {
	@org.junit.Test
	public void test() {

		People people = new People(new Car());
		people.left();
		people.right();
		people.stop();

	}

}
