package com.classes;

public class InstanceBlock {

	int a;

//	instance block
	{
		System.out.println("instance Block =1");
	}
	{
		System.out.println("instance Block =2");
	}

	public InstanceBlock() {

	}

	public InstanceBlock(int a) {

	}

	void display() {
		System.out.println("a :" + a);
	}

	public static void main(String[] args) {
		InstanceBlock ib = new InstanceBlock(10);
		ib.display();

	}

}
