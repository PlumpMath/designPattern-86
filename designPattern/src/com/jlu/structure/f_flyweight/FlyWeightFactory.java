package com.jlu.structure.f_flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FlyWeightFactory {

	private HashMap map=new HashMap();;

	public FlyWeight factory(int state) {

		if (map.containsKey(state)) {
			return (FlyWeight) map.get(state);
		} else {
			map.put(state, new ConcreteFlyWeight(state));
			return (FlyWeight) map.get(state);
		}

	}

	public void check() {

		System.out.println("*****************************************");
        int i=0;
        for(Iterator it=map.entrySet().iterator();it.hasNext(); ){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("map.get("+(i++)+") : "+ e.getKey());
        }
        System.out.println("*****************************************");

		}

	

}
