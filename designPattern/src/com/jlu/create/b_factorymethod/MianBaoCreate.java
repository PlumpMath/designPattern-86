package com.jlu.create.b_factorymethod;

public class MianBaoCreate implements Create {

	@Override
	public Product factory() {

       return new ProductMianBao();
		
	}

}
