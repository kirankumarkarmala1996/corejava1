package com.multithreading;

public class MyRunnable  implements Runnable{

	@Override
	public void run() {
		System.out.println("count down");
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		Thread threadcount = new Thread(new MyRunnable());
		threadcount.setPriority(Thread.MAX_PRIORITY);
		threadcount.start();
		System.out.println("hello");
	}

}
