package com.jlu.behavior.f_mediator;

/**
 * �н���ģʽ
 * ʹ��һ���н�Ķ��󣬷�װһ�����֮��Ľ�����������Щ����Ϳ��Բ��ñ˴���ϡ�
��������н��߳��������м����������ã�ʹ�����Ķ�����������н������ĳЩ��Ϊ���
        �������������еĲ����Ķ�������ָ�ƣ�
 * @title Test
 * @description TODO
 * @author pan
 * @date 2015��4��7��
 * @version 1.0
 */
public class Test {
  @org.junit.Test
  public void test() {
    Mediator mr=new ConcreteMediator();
    mr.notice(new CustomerImpA());
    mr.notice(new CustomerImpB());
  }

}
