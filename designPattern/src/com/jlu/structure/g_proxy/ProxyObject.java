package com.jlu.structure.g_proxy;

/**
 * ������
 * �ڴ������д��뽫Ҫ������Ķ���
 * 
 * @author pan
 *
 */
public class ProxyObject implements AbstractObject {

	private RealObject re=new RealObject();
	public void operaction() {
		//����ԭ����ǰ������һЩ����
		re.operaction();
        //����ԭ����������һЩ����
	}

}
