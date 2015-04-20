package com.jlu.behavior.f_mediator;

/**
 * �н���ʵ����
 * 
 * @title ConcreteMediator
 * @description TODO
 * @author pan
 * @date 2015��4��8��
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
