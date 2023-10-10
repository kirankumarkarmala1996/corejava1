package com.method;

//Java methods is able to return current class objects in two ways

public class ReturnTypeThis {
//	this is constructor
	public ReturnTypeThis() {
		super();
		// TODO Auto-generated constructor stub
	}

//Step 1;
//	This is method return type
	public ReturnTypeThis m1() {
		System.out.println("m1");
		return this;
	}

//Step:2
//	In almost  all cases we are using this keyword,
//	but  inside the static area this keyword not allowed hence use abject creation approach.
	public static ReturnTypeThis m2() {
		ReturnTypeThis tt = new ReturnTypeThis();
		return tt;

	}

	public static void main(String[] args) {
//		see the major defference between two methods in this class
		ReturnTypeThis rtm = new ReturnTypeThis();
		ReturnTypeThis t1 = rtm.m1();
		ReturnTypeThis t11 = rtm.m1();
		System.out.println("return value :" + t1);
		System.out.println("return value :" + t11);
		System.out.println();
		ReturnTypeThis t2 = ReturnTypeThis.m2();
		ReturnTypeThis t3 = ReturnTypeThis.m2();
		ReturnTypeThis t4 = ReturnTypeThis.m2();
		System.out.println("return value :" + t2);
		System.out.println("return value :" + t3);
		System.out.println("return value :" + t4);

	}

}
