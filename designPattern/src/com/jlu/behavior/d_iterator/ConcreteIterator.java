package com.jlu.behavior.d_iterator;

import java.util.Vector;

/**
 * ��������ʵ��Ԫ�صĵ���
 * �����Զ������������������ȡ���һ��Ԫ�صȵ�
 * @title ConcreteIterator
 * @description TODO
 * @author pan
 * @date 2015��4��7��
 * @version 1.0
 */
public class ConcreteIterator implements Iterator {
  private int number=-1;
  private Vector vector;
  public ConcreteIterator(Vector vector) {
    this.vector = vector;
  }

  /**
   * ���ص�һ��Ԫ��
   */
  public Object first() {
    number = 0;
    return vector.get(number);
  }

  /**
   * ������һ��Ԫ��
   */
  @Override
  public Object next() {
    number++;
    return vector.get(number);
  }

  /**
   * ���ص�ǰԪ��
   */
  @Override
  public Object currentItem() {
    return vector.get(number);
  }

  /**
   * �ж��Ƿ�������
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
