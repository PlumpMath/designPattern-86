
package com.jlu.behavior.m_visitor;

/**
 * �ڵ㣬�����ʵĽڵ�
 * @title Node
 * @description TODO 
 * @author pan
 * @date 2015��4��10��
 * @version 1.0
 */
public interface Node {
  //���ܷ��ʶ�������
  public void accept(Visitor visitor);
  //�ڵ�����ҵ�񷽷�
  public void action();
  

}

