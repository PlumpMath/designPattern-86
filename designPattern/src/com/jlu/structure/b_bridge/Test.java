package com.jlu.structure.b_bridge;

/**
 * 桥接模式 
 * 
 * 这个模式使用的并不多，但是思想确实很普遍。就是要分离抽象部分与实现部分。
　   实现弱关联，即在运行时才产生依赖关系。降低代码之间的耦合。
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
	
		Computer cp=new IntelComputer(new IntelCpu());
		cp.checkCpu();
		
		cp=new AdmComputer(new AdmCpu());
		cp.checkCpu();
		
		
		
	}

}
