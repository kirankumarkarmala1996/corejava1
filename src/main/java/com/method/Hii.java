package com.method;

public class Hii extends Hello {

	public void openMobile() {
		System.out.println("this is Hii");
	}
	public void openMobile(String name) {
		name="vivo";
		System.out.println("name :"+name);
	}
	public static void main(String[] args) {
		Hello h = new Hii();
		
	}
}
