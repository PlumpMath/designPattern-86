package com.jlu.structure.d_decorator;

/**
 * װ��������
 * @author pan
 *
 */
public class Mother implements Work {

	private Work wo;
	public Mother(Work wo) {
		this.wo = wo;
	}

	public void paint() {
		System.out.println("����׼�������ӵĻ�����ɫ��");
		wo.paint();
		System.out.println("����Ϊ���ӵĻ��Ϻ���ɫ�ˣ�");
   
	}

}
