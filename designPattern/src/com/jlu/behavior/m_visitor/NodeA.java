package com.jlu.behavior.m_visitor;

public class NodeA implements Node {
  // 接受访问者的请求
  @Override
  public void accept(Visitor visitor) {
    visitor.visitor(this);
  }

  @Override
  public void action() {
    System.out.println("这是NodeA的业务方法");

  }

}
