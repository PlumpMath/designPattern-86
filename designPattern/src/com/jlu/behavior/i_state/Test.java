package com.jlu.behavior.i_state;

/**
 * ״̬ģʽ
 * 
 * @title Test
 * @description TODO
 * @author pan
 * @date 2015��4��10��
 * @version 1.0
 */
public class Test {
  @org.junit.Test
  public void test() {
    
    Context tx=new Context();
    tx.setState(new ConcreteStateA());
    tx.operation();
    
    tx.setState(new ConcreteStateB());
    tx.operation();


  }

}
