package com.jlu.structure.b_bridge;

/**
 * �Ž�ģʽ 
 * 
 * ���ģʽʹ�õĲ����࣬����˼��ȷʵ���ձ顣����Ҫ������󲿷���ʵ�ֲ��֡�
��   ʵ������������������ʱ�Ų���������ϵ�����ʹ���֮�����ϡ�
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
	
		Computer cp=new IntelComputer(new IntelCpu());
		cp.checkCpu();
		
		cp=new AdmComputer(new AdmCpu());
		cp.checkCpu();
		
		
		
	}

}
