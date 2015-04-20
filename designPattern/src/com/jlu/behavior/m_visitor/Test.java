
package com.jlu.behavior.m_visitor;
/**
 * 访问者模式
 * 对于某个对象或者一组对象，不同的访问者，产生的结果不同，执行操作也不同
 * @title Test
 * @description TODO 
 * @author pan
 * @date 2015年4月10日
 * @version 1.0
 */
public class Test {
  @org.junit.Test
  public void test(){
    Context cx=new Context();
    cx.add(new NodeA());
    cx.add(new NodeB());
   //用Visitor1去访问所有的节点
    cx.visitorAll(new Visitor1());
    
    
    
  }

}

