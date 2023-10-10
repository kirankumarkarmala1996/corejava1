package com.method;

public class ReturnTypeVariables {

	int a = 10;
	String name = "hello";

//return the veriable
	int m1() {

		return a;
	}

	String m2() {

		return name;
	}

	String m3(int a, String name) {

		String str=a+" "+name;
		return str;
	}
	
	int m4(int a) {
// To represent the instance  variable  use this keyword word 
//		other wise it will give priority to local variable
		return this.a;
	}
	
	

	public static void main(String[] args) {
		ReturnTypeVariables rtv = new ReturnTypeVariables();
		System.out.println(rtv.m1());
		System.out.println(rtv.m2());
		System.out.println(rtv.m3(10, "world"));
		System.out.println(rtv.m4(100));


	}

}
