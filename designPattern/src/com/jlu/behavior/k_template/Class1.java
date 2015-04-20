package com.jlu.behavior.k_template;

/**
 * 模板继承类1
 * @title Class1
 * @description TODO 
 * @author pan
 * @date 2015年4月10日
 * @version 1.0
 */
public class Class1 extends AbstractClass {

  @Override
  protected void step1() {
    System.out.println("Class1 第一步");
  }

  @Override
  protected void step2() {
    System.out.println("Class1 第二步");

  }

  @Override
  protected void newMethod() {
    System.out.println("Class1 新方法");

  }

}
