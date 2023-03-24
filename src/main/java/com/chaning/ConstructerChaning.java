package com.chaning;

public class ConstructerChaning {
	ConstructerChaning(){
		System.out.println("this is default constructer");
	}
	
	ConstructerChaning(int x){
		this();
		
		 System.out.println("this is parameterized constructer "+x);
	}
	ConstructerChaning(int a, int b){
		this(5);
		
		System.out.println("this is two parameterized constructer "+a+" "+b);
	}
	
	public static void main(String[] args) {
		ConstructerChaning c = new ConstructerChaning(10,20);
		
	}

}
