package com.jlu.behavior.d_iterator;

import java.util.Vector;

/**
 * 迭代器，实现元素的迭代
 * 还可以定义其他方法，比如获取最后一个元素等等
 * @title ConcreteIterator
 * @description TODO
 * @author pan
 * @date 2015年4月7日
 * @version 1.0
 */
public class ConcreteIterator implements Iterator {
  private int number=-1;
  private Vector vector;
  public ConcreteIterator(Vector vector) {
    this.vector = vector;
  }

  /**
   * 返回第一个元素
   */
  public Object first() {
    number = 0;
    return vector.get(number);
  }

  /**
   * 返回下一个元素
   */
  @Override
  public Object next() {
    number++;
    return vector.get(number);
  }

  /**
   * 返回当前元素
   */
  @Override
  public Object currentItem() {
    return vector.get(number);
  }

  /**
   * 判断是否迭代完成
   */
  @Override
  public boolean hasNext() {

    if (number < vector.size() - 1) {
      return true;
    } else {
      return false;
    }

  }

}
