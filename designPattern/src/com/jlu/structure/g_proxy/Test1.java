package com.jlu.structure.g_proxy;
/**
 * ����ģʽ��
 * ��ν��������һ���˻��߻���������һ���˻��߻�����ȡ�ж�����һЩ����£�
 * һ���ͻ�������߲��ܹ�ֱ������һ������
 * �������������ڿͻ��˺�Ŀ�����֮�����н�����á�
 * @author pan
 *
 *ע��AbstractObject��RealObject��ProxyObject���ڲ��Լ򵥴���
 */
public class Test1 {
	@org.junit.Test
	public void test(){
		AbstractObject ao=new ProxyObject();
		ao.operaction();
		
	}

}
