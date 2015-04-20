
package com.jlu.behavior.m_visitor;

/**
 * 节点，被访问的节点
 * @title Node
 * @description TODO 
 * @author pan
 * @date 2015年4月10日
 * @version 1.0
 */
public interface Node {
  //接受访问对象请求
  public void accept(Visitor visitor);
  //节点自身业务方法
  public void action();
  

}

