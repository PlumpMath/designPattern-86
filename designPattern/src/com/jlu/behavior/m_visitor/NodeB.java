package com.jlu.behavior.m_visitor;

public class NodeB implements Node {
  // ���ܷ�����
  @Override
  public void accept(Visitor visitor) {
    visitor.visitor(this);

  }

  // �����ҵ�񷽷�
  @Override
  public void action() {
    System.out.println("����NodeB��ҵ�񷽷�");

  }

}
