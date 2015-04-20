package com.jlu.behavior.k_template;

/**
 * 模板方法 定义一个类的框架，当它有不同的类时，再具体实现。 　　比如，我们设计一个跨系统的客户端软件，Windows需要一套展现类，Linux需要一套，mac还需要
 * 一套。这样，只需要抽取他们的共同操作编程一个框架类，具体使用到哪个系统时，再使用对应的类， 有点像C++里面的模板。
 * 
 * @title Test
 * @description TODO
 * @author pan
 * @date 2015年4月10日
 * @version 1.0
 */
public class Test {

  @org.junit.Test
  public void test() {

    //测试模板类1
    AbstractClass ac = new Class1();
    ac.action();
    
    //测试模板类2
    ac=new Class2();
    ac.action();
    
  }



}
