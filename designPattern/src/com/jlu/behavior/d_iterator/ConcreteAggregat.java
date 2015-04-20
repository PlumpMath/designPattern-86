package com.jlu.behavior.d_iterator;

import java.util.Vector;
/**
 * 集合实现类，用于创建迭代器，传入集合类此处vector也可以换成list等其他集合类
 * @title ConcreteAggregat
 * @description TODO 
 * @author pan
 * @date 2015年4月7日
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
