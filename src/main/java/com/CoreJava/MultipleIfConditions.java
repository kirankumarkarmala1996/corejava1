package com.CoreJava;

public class MultipleIfConditions {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//		if (a > b) {
//			System.out.println("hello");
//		}
//		if (b < 10) {
//			System.out.println("Hai");
//		}
//		if (b > a) {
//			System.out.println("pass");
//		} else {
//			System.out.println("enter the correct statement");
//		}
	
//	multiple times we can use the if conditions
	int a1=15;
//	if(a1>12) {
//		System.out.println("hello");
//		if(a1>10) {
//			System.out.println("hai");
//			if(a1<16) {
//				System.out.println("welcome");
//				if(a1<20) {
//					System.out.println("a1 is leasser then 20");
//				}
//			}
//		}
//	}
	
//	<, >,<=,>=,!=,==,
	int num =10;
	int numb =9;
//	if(num==numb) {
//		System.out.println("pass");
//	}else {
//		System.out.println("fail");
//	}
//	if(num!=numb) {
//		System.out.println("bye");
//	}
//	if(num<=numb) {
//		System.out.println("hello");
//	}if(num>=numb) {
//		System.out.println("hai");
//	}
	
	String name="kiran";
	String name1= "kiran";
//	if we use .equals() it compare content comparison
//	if we use == it compare reference address comparison
//	if(name.equals(name1)) {
//		System.out.println("pass");
//	}else if(name==name1){
//		System.out.println("Hello");
//	}

//	dead code
	if(true) {
		System.out.println("testpass");//
	}else {
		System.out.println("testfail");
	}
	
	
	
	
	boolean t =false;
	if(t) {
		System.out.println("testpass1");
	}else {
		System.out.println("testfail1");//
	}
	boolean f = false;
	if(!f) {
		System.out.println("testpass2");//
	}else {
		System.out.println("testfail2");
	}
}
}
