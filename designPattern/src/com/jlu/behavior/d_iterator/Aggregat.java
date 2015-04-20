
package com.jlu.behavior.d_iterator;
/**
 * 集合接口，用于生产迭代器，并传入需要迭代的集合
 * @title Aggregat
 * @description TODO 
 * @author pan
 * @date 2015年4月7日
 * @version 1.0
 */
public interface Aggregat {
  
  public Iterator createIterator();

}

