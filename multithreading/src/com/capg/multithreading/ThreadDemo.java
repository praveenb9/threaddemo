package com.capg.multithreading;

public class ThreadDemo extends Thread {

	@Override
	public void run() {


		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"  "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		ThreadDemo t1 = new ThreadDemo();
		t1.setName("javeed");
		ThreadDemo t2 = new ThreadDemo();
		t2.setName("king");
		
		t1.start();
		t2.start();
	
	}

}
