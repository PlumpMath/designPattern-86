package com.jlu.behavior.m_visitor;

import java.util.LinkedList;
import java.util.List;

public class Context {
  private List<Node> nodes;

  public Context() {
    nodes = new LinkedList<Node>();
  }

  // ���Ҫ���ʵĽڵ�
  public void add(Node node) {
    nodes.add(node);
  }

  // ������ʵ�ֶ����нڵ�ķ���
  public void visitorAll(Visitor visitor) {

    for (Node node : nodes) {

      node.accept(visitor);


    }



  }


}
