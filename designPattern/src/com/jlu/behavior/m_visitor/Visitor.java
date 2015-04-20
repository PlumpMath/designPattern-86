
package com.jlu.behavior.m_visitor;
/**
 * 访问者接口,实现对所有节点的访问
 * 如果增加了节点的话，可以继承此接口来增加访问方法
 * @title Visitor
 * @description TODO 
 * @author pan
 * @date 2015年4月10日
 * @version 1.0
 */
public interface Visitor {
  
  public void visitor(NodeA nodeA);
  public void visitor(NodeB nodeB);
 
}

