package com.jlu.behavior.m_visitor;

/**
 * �����߽ӿ�ʵ����1 ��Ҫ��ɶ����нڵ�ķ���
 * 
 * @title Visitor1
 * @description TODO
 * @author pan
 * @date 2015��4��10��
 * @version 1.0
 */
public class Visitor1 implements Visitor {

  @Override
  public void visitor(NodeA nodeA) {
    System.out.println("���ʽڵ�A�����ҵ��ýڵ�A��ҵ�񷽷�");
    nodeA.action();
  }

  @Override
  public void visitor(NodeB nodeB) {
    System.out.println("���ʽڵ�B�����ҵ��ýڵ�B��ҵ�񷽷�");
    nodeB.action();
  }

 

}
