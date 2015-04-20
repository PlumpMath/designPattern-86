package com.jlu.behavior.a_chainOfResponsibility;
/**
 * 职责链模式：
 * 本例如下：
 * 项目经理-->部门经理-->总经理    一步步往后传
 * 每个角色完成分内的事情
 * @author Administrator
 *
 */
public class Test {
	@org.junit.Test
	public void test(){
		
		Handler handler1=new ProjectManagerHandler();
		handler1.feeRequest("李四", 900);//测试时，参数可以随便给
		
		
		/*Handler handler2=new DeptManagerHandler();
		handler2.feeRequest("张三", 400);*/
		
	}

}
