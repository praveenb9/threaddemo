package com.capg.practice;

public class StudentFailException extends RuntimeException{

	public StudentFailException(String x)
	{
		System.err.println(x);
	}
}
