package com.capg.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateExperience {
	
	public int getYears(LocalDate date)
	{
		long years=ChronoUnit.YEARS.between(date,LocalDate.now());
		return (int)years;
	}
	public int getDays(LocalDate date)
	{
		long days=ChronoUnit.DAYS.between(date,LocalDate.now());
		return (int)days;
	}
	public int getMonths(LocalDate date)
	{
		long months=ChronoUnit.MONTHS.between(date,LocalDate.now());
	return (int)months;
	}
	public long getMinutes(LocalDate date)
	{
		
		long minutes=ChronoUnit.MINUTES.between(date,LocalDate.now());
	return minutes;
	}
	public static void main(String[] args) {

		CalculateExperience obj=new CalculateExperience();
LocalDate date=LocalDate.of(1998,9,28);
	//int years=obj.getYears(date);
	//int days=obj.getDays(date);
	//int months=obj.getMonths(date);

System.out.println("  Experience ");
	System.out.println("no of years = "+obj.getYears(date));
	
	System.out.println("no of months = "+obj.getMonths(date));
	System.out.println("no of days = "+obj.getDays(date));
	
	}

}
