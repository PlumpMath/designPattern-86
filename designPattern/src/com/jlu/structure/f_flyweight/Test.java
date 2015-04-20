package com.jlu.structure.f_flyweight;
/**
 * 享元模式：
 * @author pan
 *1 一个系统应用到了大量的对象，而且很多都是重复的。
　 2 由于大量对象的使用，造成了存储效率上的开销。
　 3 对象的状态大多是外部状态，不干扰状态本身。
　 4 如果剔除这些外部状态，可以用一组小规模的对象表示共享对象。
最近项目中就有这个使用场景，比如一些文件的图标，由于重复使用，
完全可以采用这种模式，放入缓存中，以后每次调用直接从缓存中读取就行了。
 */
public class Test {
	
	@org.junit.Test
	public void test(){
		
		FlyWeightFactory f=new FlyWeightFactory();
		
		f.factory(1);
		f.factory(2);
		f.factory(3);
		f.factory(3);
		f.factory(4);
		f.factory(4);
		f.factory(5);
		
		f.check();
		
	}

}
