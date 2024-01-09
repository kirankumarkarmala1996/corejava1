package com.stringMethods;

public class StringcCompareToMethod {
public static void main(String[] args) {
	String s1="hello";
	String s2="hello";
	String s3="java";
	String s4 = "world";
	
	System.out.println(s1.compareTo(s2));//0
	System.out.println(s1.compareTo(s3));//
	System.out.println(s2.compareTo(s3));//
	System.out.println(s2.compareTo(s4));//
	System.out.println(s3.compareTo(s4));//
	
	
	
}
}
