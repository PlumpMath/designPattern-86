package com.jlu.behavior.k_template;

/**
 * ģ�巽�� ����һ����Ŀ�ܣ������в�ͬ����ʱ���پ���ʵ�֡� �������磬�������һ����ϵͳ�Ŀͻ��������Windows��Ҫһ��չ���࣬Linux��Ҫһ�ף�mac����Ҫ
 * һ�ס�������ֻ��Ҫ��ȡ���ǵĹ�ͬ�������һ������࣬����ʹ�õ��ĸ�ϵͳʱ����ʹ�ö�Ӧ���࣬ �е���C++�����ģ�塣
 * 
 * @title Test
 * @description TODO
 * @author pan
 * @date 2015��4��10��
 * @version 1.0
 */
public class Test {

  @org.junit.Test
  public void test() {

    //����ģ����1
    AbstractClass ac = new Class1();
    ac.action();
    
    //����ģ����2
    ac=new Class2();
    ac.action();
    
  }



}
