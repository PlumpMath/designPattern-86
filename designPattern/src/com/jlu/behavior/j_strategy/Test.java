
package com.jlu.behavior.j_strategy;
/**
 * ����ģʽ
 * �����������������㷨ʵ��SortStrategy
 * @title Test
 * @description TODO 
 * @author pan
 * @date 2015��4��10��
 * @version 1.0
 */
public class Test {
  @org.junit.Test
  public void test(){
    
    //ʵ�ֿ��������㷨
    Context context=new Context();
    context.setSortStrategy(new QuickSortStrategy());
    context.sort();
    //ʵ�ֶ�Ԫ����
    context.setSortStrategy(new BinarySortStrategy());
    context.sort();
    
  }

}

