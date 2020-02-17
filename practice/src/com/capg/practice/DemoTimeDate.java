package com.capg.practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DemoTimeDate {

	public static void main(String[] args) {


		LocalDate date=LocalDate.now();
		LocalDate date2=LocalDate.of(2017,12,2);
		Period p=date2.until(date);
		System.out.println(p);
		//date2.f;
		/*int exp=date.getYear()-date2.getYear();
		
		DateTimeFormatter formatter= DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		String format=date.format(formatter);
		System.out.println(format);
		*/
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter formatdate= DateTimeFormatter.ofPattern("yy/MM/dd");
		//String text=sc.next();
		String text="19/12/02";
		LocalDate date3=LocalDate.parse(text,formatdate);
		System.out.println(date3);
		/*System.out.println(date2.withDayOfMonth(30));
		System.out.println(date2.withDayOfYear(exp));
		System.out.println(p.getMonths()+" "+p.getDays()+" "+p.getYears());
		*/
	}

}
