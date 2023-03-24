package com.arrayconcepts;

public class Array {
	public static void main(String[] args) {
		System.out.println("----int Array-----");
		int arr[]= new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=50;
		arr[3]=10;
		arr[4]=150;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[4]);
		System.out.println();
		System.out.println("=============");
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----string Array-----");
		
		String names[]= new String[4];
		names[0]="kiran";
		names[1]="anil";
		names[2]="amma";
		names[3]="ashok";
		
		System.out.println(names[2]);
		System.out.println(names[1]);
		
		System.out.println();
		System.out.println("==============");
		
		for(int j=0;j<=names.length-1;j++) {
			System.out.println(names[j]);
		}
		System.out.println("---------double type Array---------");
		double dd[]=new double[5];
		dd[0]=10.00;
		dd[1]=100.00;
		dd[2]=1000.00;
		dd[3]=1010.00;
		dd[4]=10001.00;
		
		
		System.out.println(dd[2]);
		System.out.println(dd[3]);
		System.out.println(dd[4]);
		System.out.println();
		System.out.println("=================");
		
		for(int k=0;k<=dd.length-1;k++) {
			System.out.println(dd[k]);
		}
	}

}
