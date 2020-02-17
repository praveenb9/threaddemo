package com.capg.multithreading;

public class DemoThread implements Runnable{

	@Override
	public void run() {

		System.out.println("run thread");	
	}

	public void main(String [] args)
	{
		DemoThread dt=new DemoThread();
		Thread t=new Thread(dt);
		t.start();
	}
}
