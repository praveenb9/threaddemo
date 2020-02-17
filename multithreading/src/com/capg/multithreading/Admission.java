package com.capg.multithreading;

public class Admission implements Runnable {
	
	int seats=1;
	public synchronized void run()
	{
		if(seats == 0)
		{
			System.err.println("All seats are sold");

		}
		else
		{
			System.out.println("Seat is allocated to "+ Thread.currentThread().getName());
		}
		seats--;
		//System.out.println("Remaining seats available "+seats);
	}

	public static void main(String[] args) {


		Admission obj=new Admission();
		Thread t1=new Thread(obj,"suresh");
		
		Thread t2 =new Thread(obj,"ramesh");
		System.out.println("No of seats available before "+obj.seats);
		t2.start();
		t1.start();
	

	}

}
