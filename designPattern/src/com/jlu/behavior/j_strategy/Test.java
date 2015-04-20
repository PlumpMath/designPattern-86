
package com.jlu.behavior.j_strategy;
/**
 * 策略模式
 * 还可以有其他排序算法实现SortStrategy
 * @title Test
 * @description TODO 
 * @author pan
 * @date 2015年4月10日
 * @version 1.0
 */
public class Test {
  @org.junit.Test
  public void test(){
    
    //实现快速排序算法
    Context context=new Context();
    context.setSortStrategy(new QuickSortStrategy());
    context.sort();
    //实现二元排序
    context.setSortStrategy(new BinarySortStrategy());
    context.sort();
    
  }

}

