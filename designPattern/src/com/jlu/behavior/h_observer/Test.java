package com.jlu.behavior.h_observer;

/**
 * 观察者模式 这个模式定义了对象之间的一种依赖关系，当一个对象发生变化时，
 * 其他的对象收到更新，也发生变化。
 * 
 * @title Test
 * @description TODO
 * @author pan
 * @date 2015年4月7日
 * @version 1.0
 */
public class Test {
  @org.junit.Test
  public void test() {
    Observer a = new ObserverImpA();
    Observer b = new ObserverImpB();
    Observer c = new ObserverImpC();
    // 添加所有观察者后，更新所有观察者
    Subject sub = new ConcreteSubject();
    sub.attach(a);
    sub.attach(b);
    sub.attach(c);
    sub.notifyAllObserver();

    // 删除观察者a后，更新所有观察者
    sub.detach(a);
    sub.notifyAllObserver();



  }

}
