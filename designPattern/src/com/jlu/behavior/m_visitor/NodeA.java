package com.jlu.behavior.m_visitor;

public class NodeA implements Node {
  // ���ܷ����ߵ�����
  @Override
  public void accept(Visitor visitor) {
    visitor.visitor(this);
  }

  @Override
  public void action() {
    System.out.println("����NodeA��ҵ�񷽷�");

  }

}
