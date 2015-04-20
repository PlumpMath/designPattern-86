package com.jlu.behavior.f_mediator;

/**
 * 中介者模式
 * 使用一个中介的对象，封装一组对象之间的交互，这样这些对象就可以不用彼此耦合。
　　这个中介者常常起着中间桥梁的作用，使其他的对象可以利用中介者完成某些行为活动，
        因此它必须对所有的参与活动的对象了如指掌！
 * @title Test
 * @description TODO
 * @author pan
 * @date 2015年4月7日
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
