package com.jlu.create.e_singleton;

/**
 * ÀÁººÄ£Ê½
 * @author Administrator
 *
 */
public class Singleton2 {
	
	private static Singleton2 sl=null;
	
	private Singleton2(){
	
	}
	
	public synchronized static Singleton2 getInstance(){
		if(sl==null){
			sl=new Singleton2();
		}
		return sl;
		
		
	}

}
