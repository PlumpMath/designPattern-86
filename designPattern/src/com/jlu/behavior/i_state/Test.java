package com.jlu.behavior.i_state;

/**
 * 状态模式
 * 
 * @title Test
 * @description TODO
 * @author pan
 * @date 2015年4月10日
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
