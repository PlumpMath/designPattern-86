package com.jlu.behavior.b_commond;

/**
 * ����ģʽ�� �����һ��������������������ʵ��
 * People������������
 * Car�����������
 * Commond������
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
