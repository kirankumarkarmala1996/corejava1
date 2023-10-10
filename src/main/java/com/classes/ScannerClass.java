package com.classes;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//		to get the int value
		System.out.println("enter the number");
		int num=sc.nextInt();
		
//		to get the float value
		System.out.println("enter the floatvalue");
		float f=sc.nextFloat();
		
//		to get the String value
		System.out.println("enter the String");
		String st=sc.next();
		
//		to get the singleline value
		System.out.println("enter the singleline");
		String singleline=sc.nextLine();
		
//		to close input stream 
		System.out.println("close input stream");
		sc.close();
	}

}
