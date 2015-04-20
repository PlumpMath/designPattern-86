package com.jlu.behavior.d_iterator;

import java.util.Vector;
/**
 * ����ʵ���࣬���ڴ��������������뼯����˴�vectorҲ���Ի���list������������
 * @title ConcreteAggregat
 * @description TODO 
 * @author pan
 * @date 2015��4��7��
 * @version 1.0
 */
public class ConcreteAggregat implements Aggregat {
  private Vector vector=null;

  public ConcreteAggregat(Vector vector) {
    this.vector = vector;
  }
  @Override
  public Iterator createIterator() {
    return new ConcreteIterator(vector);
  }

}
