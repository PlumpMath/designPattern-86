package com.jlu.structure.d_decorator;

import junit.framework.TestCase;

/**
 * 装饰模式：（比较有意思，实现了功能的组合）。与适配器模式有点相像
 * 应用场景
　　1 在不生成子类的情况下，为对象动态的添加某些操作。
　　2 处理一些可以撤销的职责。
　　3 当不能使用生成子类来扩充时。
 * @author Administrator
 * 
 * 1、 Work.java     接口
   2、 Son.java      被装饰者-负责画画
   3、 Mother.java   装饰者-负责上颜色
   4、 Father.java   装饰者-负责装画框
 *
 */
public class Test{
	
//	@org.junit.Test
	/**
	 * 测试妈妈装饰儿子
	 */
	public void test1(){
		Work wo=new Mother(new Son());
		wo.paint();
	}
	
	/**
	 * 测试爸爸装饰儿子
	 */
	@org.junit.Test
	public void test2(){
		Work wo=new Father(new Son());
		wo.paint();
	}

//	@org.junit.Test
	/**
	 * 测试爸爸装饰妈妈和儿子
	 */
	public void test3(){
		Work wo=new Father(new Mother(new Son()));
		wo.paint();
	}

}
