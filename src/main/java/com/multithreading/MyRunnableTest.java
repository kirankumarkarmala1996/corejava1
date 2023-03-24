package com.multithreading;

public class MyRunnableTest {
	public static void main(String[] args) {

	MyRunnable r = new MyRunnable();
	Thread t  = new Thread(r);
	t.start();
	System.out.println("main thread");
}
}
