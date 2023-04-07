package com.Loops;

public class ForLoop {
	public static void main(String[] args) {
//		// No of ways to print
//		System.out.println(" first way");
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//
//		System.out.println(" second way");
//		System.out.println("6\n7\n8\n9\n10\n");
//
//		System.out.println(" Third way");
//		for (int i = 1; i <= 1000; i++) {
//			System.out.println(i);
//		}
//		System.out.println("---------------");

//		System.out.println(" reverse the number");
//		for (int i = 100; i >= 1; i--) {
//			System.out.println(i);
//		}
//		System.out.println("-------1---------");
//		int i=10;
//		for(;i>=1;i--) {
//			System.out.println(i);
//		}
		System.out.println("------2-------");
		int j=10;
		for(;;j--) {
			System.out.println(j);
			if(j<=1) {
				break;
			}
		}
		System.out.println("----1------");
		int k=10;
		for(;;) {
			System.out.println(k);
			if(k<=1) {
				break;
			}
			k--;
		}
		
	}

}
