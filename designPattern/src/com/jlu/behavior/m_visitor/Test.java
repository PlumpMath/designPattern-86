
package com.jlu.behavior.m_visitor;
/**
 * ������ģʽ
 * ����ĳ���������һ����󣬲�ͬ�ķ����ߣ������Ľ����ͬ��ִ�в���Ҳ��ͬ
 * @title Test
 * @description TODO 
 * @author pan
 * @date 2015��4��10��
 * @version 1.0
 */
public class Test {
  @org.junit.Test
  public void test(){
    Context cx=new Context();
    cx.add(new NodeA());
    cx.add(new NodeB());
   //��Visitor1ȥ�������еĽڵ�
    cx.visitorAll(new Visitor1());
    
    
    
  }

}

