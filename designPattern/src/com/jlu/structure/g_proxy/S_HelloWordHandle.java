package com.jlu.structure.g_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬������
 * @author pan
 *
 */
public class S_HelloWordHandle implements InvocationHandler {

	private Object obj;//����Ҫ����Ķ���

	public S_HelloWordHandle(Object obj) {
		this.obj = obj;
	}

	//����ʵ���˵���ԭ����ķ�����
	//�������һ����ִ�С�
	public Object invoke(Object proxy, Method method, Object[] arg)
			throws Throwable {

		Object result;
		//����ǰ��һЩ����
		System.out.println("before");
		result = method.invoke(obj, arg);
		//���ú���һЩ����
		System.out.println("after");
		return result;
	}
	

	
}
