package com.jlu.behavior.k_template;
/**
 * 模板继承类2
 * @title Class2
 * @description TODO 
 * @author pan
 * @date 2015年4月10日
 * @version 1.0
 */
public class Class2 extends AbstractClass {

  @Override
  protected void step1() {
    System.out.println("Class2 第一步");
  }

  @Override
  protected void step2() {
    System.out.println("Class2 第二步");

  }

  @Override
  protected void newMethod() {
    System.out.println("Class2 新方法");

  }

}
