package com.jlu.behavior.m_visitor;

public class NodeB implements Node {
  // 接受访问者
  @Override
  public void accept(Visitor visitor) {
    visitor.visitor(this);

  }

  // 自身的业务方法
  @Override
  public void action() {
    System.out.println("这是NodeB的业务方法");

  }

}
