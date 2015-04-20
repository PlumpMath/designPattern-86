package com.jlu.behavior.a_chainOfResponsibility;

public abstract class Handler {

	protected Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public abstract void feeRequest(String str, int fee);

}
