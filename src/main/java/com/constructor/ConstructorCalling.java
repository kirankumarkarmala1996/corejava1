package com.constructor;

public class ConstructorCalling  {
	// TODO Auto-generated constructor stub
	
	public ConstructorCalling(double num) {
		this(10);
		System.out.println("double arg ");
	}
	public ConstructorCalling(int nu) {
		this();
		System.out.println("int arg");
	}
	public ConstructorCalling() {
		System.out.println("no arg");
	}
		
	public static void main(String[] args) {
		
//		ConstructorCalling cc = new ConstructorCalling(10.5) ;
//			ConstructorCalling c1 = new ConstructorCalling(10);
			ConstructorCalling c1 = new ConstructorCalling();
		
	}


}
