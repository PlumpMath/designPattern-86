package com.jlu.behavior.a_chainOfResponsibility;

/**
 *  总经理处理1000元以上的经费请求，高于的交给更高级的处理
 * @author Administrator
 *
 */
public class GeneralManagerHandler extends Handler {

	@Override
	public void feeRequest(String str, int fee) {
		
		if (fee>=1000) {
			// 只处理张三的请求
			if ("张三".equals(str)) {
				System.out.println("总经理同意张三的经费请求，经费为:" + fee + "元！");
			}
			// 其他人的不处理
			else {
				System.out.println("总经理不同意"+str + "的" + fee + "元经费请求！");
			}

		} else {
			
			//已是最高级了，不用传递了
		}
		

	}

}
