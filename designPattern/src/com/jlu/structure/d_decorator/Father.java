package com.jlu.structure.d_decorator;

public class Father implements Work {

	private Work wo;
	
	public Father(Work wo) {
		this.wo = wo;
	}

	public void paint() {
		System.out.println("�ְ�׼�������ӵĻ��ϻ���");
		wo.paint();
		System.out.println("�ְ�Ϊ���ӵĻ��Ϻ��˻���");

	}

}
