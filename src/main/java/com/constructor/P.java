package com.constructor;

public class P extends ConstructorOverride {
	public P(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {

		// it donesn't override the constructor from parent class
		// if doesn't provide value inside while creating obj
		// it will throw the compile time error
		 P p = new P(10) ;
	}

}
