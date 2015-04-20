package com.jlu.create.b_factorymethod;

public class Test {

	/**工厂方法：（相对于抽象工厂用的居多）
	 * 以创建面包和油条为例。
	 * Creator 创建工厂的接口
　　         MianBaoCreator、YouTiaoCreator 具体的产品创建者,可以继续
                扩展产品创建者，实现Create接口
　　          Product 产品的接口
　　         ProductMianTiao、ProductYouTiao具体的产品
	 * @param args
	 */
	public static void main(String[] args) {
		
		Create c;
		c=new MianBaoCreate();
		c.factory().eating();
		
		
		c=new YouTiaoCreate();
		c.factory().eating();
		

	}

}
