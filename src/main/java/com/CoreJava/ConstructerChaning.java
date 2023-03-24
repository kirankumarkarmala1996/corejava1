package com.CoreJava;

public class ConstructerChaning {
	public ConstructerChaning() {
		this(10);
		System.out.println("this is default constructer");
		System.out.println("=================");
	}
	
	 public ConstructerChaning(int a) {
		 this(10,"kiran");
		 System.out.println(a);
		 System.out.println("this is  single parameterized constructer");
		 System.out.println("==================");
	 }
	 public ConstructerChaning(int a,String name) {
		 System.out.println(a+" "+name);
		 System.out.println("this is double parameter");
		 System.out.println("===============");
	 }
	public static void main(String[] args) {
		ConstructerChaning cc= new ConstructerChaning();
	}

}
