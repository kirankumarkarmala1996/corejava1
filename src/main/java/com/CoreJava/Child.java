package com.CoreJava;

public class Child extends parent {
	public void hello() {
//		super.hello();
		System.out.println("this is child hello");
	}
	
	public static void main(String[] args) {
		parent p = new Child();
		 p.hello();;
		
//		Child c = (Child) new parent();
		
		
	}
}
