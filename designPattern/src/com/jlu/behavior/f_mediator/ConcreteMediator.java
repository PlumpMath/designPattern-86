package com.jlu.behavior.f_mediator;

/**
 * 中介者实现类
 * 
 * @title ConcreteMediator
 * @description TODO
 * @author pan
 * @date 2015年4月8日
 * @version 1.0
 */
public class ConcreteMediator implements Mediator {
  private CustomerImpA ca;
  private CustomerImpB cb;

  public ConcreteMediator() {
    ca = new CustomerImpA();
    cb = new CustomerImpB();
  }

  @Override
  public void notice(Customer customer) {

    if (customer instanceof CustomerImpA) {
      ca.action();
    }
    if (customer instanceof CustomerImpB) {
      cb.action();
    }


  }

}
