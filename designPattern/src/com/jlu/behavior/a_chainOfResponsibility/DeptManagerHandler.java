package com.jlu.behavior.a_chainOfResponsibility;

/**
 * 部门经理处理500-1000元的经费请求，高于的交给更高级的处理
 * 
 * @author Administrator
 *
 */
public class DeptManagerHandler extends Handler {

	@Override
	public void feeRequest(String str, int fee) {

		if (fee >= 500 && fee < 1000) {
			// 只处理张三的请求
			if ("张三".equals(str)) {
				System.out.println("部门经理同意张三的经费请求，经费为:" + fee + "元！");
			}
			// 其他人的不处理
			else {
				System.out.println("部门经理不同意" + str + "的" + fee + "元经费请求！");
			}

		} else {
			System.out.println("部门经理没有这个权限!");
			setHandler(new GeneralManagerHandler());
			getHandler().feeRequest(str, fee);
		}

	}

}
