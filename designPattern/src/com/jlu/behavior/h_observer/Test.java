package com.jlu.behavior.h_observer;

/**
 * �۲���ģʽ ���ģʽ�����˶���֮���һ��������ϵ����һ���������仯ʱ��
 * �����Ķ����յ����£�Ҳ�����仯��
 * 
 * @title Test
 * @description TODO
 * @author pan
 * @date 2015��4��7��
 * @version 1.0
 */
public class Test {
  @org.junit.Test
  public void test() {
    Observer a = new ObserverImpA();
    Observer b = new ObserverImpB();
    Observer c = new ObserverImpC();
    // ������й۲��ߺ󣬸������й۲���
    Subject sub = new ConcreteSubject();
    sub.attach(a);
    sub.attach(b);
    sub.attach(c);
    sub.notifyAllObserver();

    // ɾ���۲���a�󣬸������й۲���
    sub.detach(a);
    sub.notifyAllObserver();



  }

}
