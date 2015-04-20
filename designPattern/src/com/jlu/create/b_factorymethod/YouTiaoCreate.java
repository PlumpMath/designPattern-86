package com.jlu.create.b_factorymethod;

public class YouTiaoCreate implements Create {

	@Override
	public Product factory() {

		return new ProductYouTiao();

	}

}
