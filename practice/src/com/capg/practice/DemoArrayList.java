package com.capg.practice;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {


		List<String> list =new ArrayList<String>();
		list.add(null);
		list.add(0, "kola");
		//list.clear();
		boolean flag=list.contains("kola");
		
		System.out.println(list.indexOf("kola"));
	}

}
