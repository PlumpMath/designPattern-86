package com.jlu.behavior.m_visitor;

import java.util.LinkedList;
import java.util.List;

public class Context {
  private List<Node> nodes;

  public Context() {
    nodes = new LinkedList<Node>();
  }

  // 添加要访问的节点
  public void add(Node node) {
    nodes.add(node);
  }

  // 访问者实现对所有节点的访问
  public void visitorAll(Visitor visitor) {

    for (Node node : nodes) {

      node.accept(visitor);


    }



  }


}
