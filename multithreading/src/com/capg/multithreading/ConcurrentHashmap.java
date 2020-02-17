package com.capg.multithreading;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmap {

	public static void main(String[] args) {

		ConcurrentHashmap obj=new ConcurrentHashmap();
		ConcurrentHashMap<Integer, String> hashmap =obj.getMap();
	
		String val=hashmap.search(10_000, (key,value)->value.startsWith("k")?"present":"non-present");
	System.out.println(val);
	}

	public ConcurrentHashMap<Integer, String> getMap() {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();

		map.put(1,"king");
		map.put(2,"harish");
		map.put(3,"javeed");
		map.put(4,"kanisk");
		map.put(5,"keethan");
		return map;
	}

}
