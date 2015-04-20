package com.jlu.behavior.a_chainOfResponsibility;

/**
 * 项目经理只处理500元以下的经费请求，大于500元的留给更高级的处理
 * 
 * @author Administrator
 *
 */
public class ProjectManagerHandler extends Handler {

	@Override
	public void feeRequest(String str, int fee) {

		if (fee < 500) {
			// 只处理张三的请求
			if ("张三".equals(str)) {
				System.out.println("项目经理同意张三的经费请求，经费为:" + fee + "元！");
			}
			// 其他人的不处理
			else {
				System.out.println("项目经理不同意"+str + "的" + fee + "元经费请求！");
			}

		} else {
            System.out.println("项目经理没有这个权限！");
			setHandler(new DeptManagerHandler());
			getHandler().feeRequest(str, fee);
			

		}

	}
}
