package com.constructor;

public class RecrusiveConstructor {
	
	//RecrusiveConstructor
//	it will throw the compile time error
	public RecrusiveConstructor() {
//		this("String");
	}
	public RecrusiveConstructor(String name) {
		this();
	}
	public static void main(String[] args) {
		System.out.println("String");
	}
	

}
