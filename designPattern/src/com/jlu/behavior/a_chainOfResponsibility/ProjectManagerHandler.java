package com.jlu.behavior.a_chainOfResponsibility;

/**
 * ��Ŀ����ֻ����500Ԫ���µľ������󣬴���500Ԫ���������߼��Ĵ���
 * 
 * @author Administrator
 *
 */
public class ProjectManagerHandler extends Handler {

	@Override
	public void feeRequest(String str, int fee) {

		if (fee < 500) {
			// ֻ��������������
			if ("����".equals(str)) {
				System.out.println("��Ŀ����ͬ�������ľ������󣬾���Ϊ:" + fee + "Ԫ��");
			}
			// �����˵Ĳ�����
			else {
				System.out.println("��Ŀ����ͬ��"+str + "��" + fee + "Ԫ��������");
			}

		} else {
            System.out.println("��Ŀ����û�����Ȩ�ޣ�");
			setHandler(new DeptManagerHandler());
			getHandler().feeRequest(str, fee);
			

		}

	}
}
