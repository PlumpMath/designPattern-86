package com.jlu.behavior.d_iterator;

import java.util.Vector;

/**
 * ����ģʽ
 * 
 * @title Test
 * @description TODO
 * @author pan
 * @date 2015��4��7��
 * @version 1.0
 */
public class Test {
  @org.junit.Test
  public void test() {
    
    Vector vector=new Vector();
    vector.add("����");
    vector.add("����");
    vector.add("����");
    vector.add("����");
    
    Aggregat agg=new ConcreteAggregat(vector);
    Iterator ite= agg.createIterator();
    while(ite.hasNext()){
      System.out.println(ite.next());
      
    }

  }


}
