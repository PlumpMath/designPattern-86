package com.jlu.behavior.a_chainOfResponsibility;

/**
 * ���ž�����500-1000Ԫ�ľ������󣬸��ڵĽ������߼��Ĵ���
 * 
 * @author Administrator
 *
 */
public class DeptManagerHandler extends Handler {

	@Override
	public void feeRequest(String str, int fee) {

		if (fee >= 500 && fee < 1000) {
			// ֻ��������������
			if ("����".equals(str)) {
				System.out.println("���ž���ͬ�������ľ������󣬾���Ϊ:" + fee + "Ԫ��");
			}
			// �����˵Ĳ�����
			else {
				System.out.println("���ž���ͬ��" + str + "��" + fee + "Ԫ��������");
			}

		} else {
			System.out.println("���ž���û�����Ȩ��!");
			setHandler(new GeneralManagerHandler());
			getHandler().feeRequest(str, fee);
		}

	}

}
