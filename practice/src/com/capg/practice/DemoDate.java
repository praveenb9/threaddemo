package com.capg.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {


		Date d1=new Date();
		Date d2=new Date("2020/10/10");
	
		SimpleDateFormat formater=new SimpleDateFormat("dd-MM-yy");
		String newdate=formater.format(d1);
		
		System.out.println(newdate);
		System.out.println(d2);
		

	}

}
