package com.jlu.behavior.d_iterator;

import java.util.Vector;

/**
 * 迭代模式
 * 
 * @title Test
 * @description TODO
 * @author pan
 * @date 2015年4月7日
 * @version 1.0
 */
public class Test {
  @org.junit.Test
  public void test() {
    
    Vector vector=new Vector();
    vector.add("张三");
    vector.add("李四");
    vector.add("王五");
    vector.add("刘能");
    
    Aggregat agg=new ConcreteAggregat(vector);
    Iterator ite= agg.createIterator();
    while(ite.hasNext()){
      System.out.println(ite.next());
      
    }

  }


}
