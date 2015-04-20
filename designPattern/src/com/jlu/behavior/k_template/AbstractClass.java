package com.jlu.behavior.k_template;

/**
 * 模板类
 * @title AbstractClass
 * @description TODO 
 * @author pan
 * @date 2015年4月10日
 * @version 1.0
 */
public abstract class AbstractClass {

  protected void action() {
    step1();
    step2();
    newMethod();
  }

  protected abstract void step1();

  protected abstract void step2();

  protected abstract void newMethod();



}
