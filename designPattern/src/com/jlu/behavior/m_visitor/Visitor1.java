package com.jlu.behavior.m_visitor;

/**
 * 访问者接口实现类1 需要完成对所有节点的访问
 * 
 * @title Visitor1
 * @description TODO
 * @author pan
 * @date 2015年4月10日
 * @version 1.0
 */
public class Visitor1 implements Visitor {

  @Override
  public void visitor(NodeA nodeA) {
    System.out.println("访问节点A，并且调用节点A的业务方法");
    nodeA.action();
  }

  @Override
  public void visitor(NodeB nodeB) {
    System.out.println("访问节点B，并且调用节点B的业务方法");
    nodeB.action();
  }

 

}
