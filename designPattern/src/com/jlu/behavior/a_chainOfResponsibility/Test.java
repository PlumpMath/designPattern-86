package com.jlu.behavior.a_chainOfResponsibility;
/**
 * ְ����ģʽ��
 * �������£�
 * ��Ŀ����-->���ž���-->�ܾ���    һ��������
 * ÿ����ɫ��ɷ��ڵ�����
 * @author Administrator
 *
 */
public class Test {
	@org.junit.Test
	public void test(){
		
		Handler handler1=new ProjectManagerHandler();
		handler1.feeRequest("����", 900);//����ʱ��������������
		
		
		/*Handler handler2=new DeptManagerHandler();
		handler2.feeRequest("����", 400);*/
		
	}

}
