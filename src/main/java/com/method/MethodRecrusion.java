package com.method;

public class MethodRecrusion {
//	in this method throws the stack over flow error
	 public static void kiranCalling() {
		 ashokCalling();
		 
	 }
	 
	 public static void ashokCalling() {
		 kiranCalling();
	 }
	 public static void main(String[] args) {
		 kiranCalling();
		System.out.println("calling");
		//output
//		Exception in thread "main" java.lang.StackOverflowError
	}
	 

}
