package com.jlu.behavior.a_chainOfResponsibility;

/**
 *  �ܾ�����1000Ԫ���ϵľ������󣬸��ڵĽ������߼��Ĵ���
 * @author Administrator
 *
 */
public class GeneralManagerHandler extends Handler {

	@Override
	public void feeRequest(String str, int fee) {
		
		if (fee>=1000) {
			// ֻ��������������
			if ("����".equals(str)) {
				System.out.println("�ܾ���ͬ�������ľ������󣬾���Ϊ:" + fee + "Ԫ��");
			}
			// �����˵Ĳ�����
			else {
				System.out.println("�ܾ���ͬ��"+str + "��" + fee + "Ԫ��������");
			}

		} else {
			
			//������߼��ˣ����ô�����
		}
		

	}

}
