package com.Loops;

public class IsPrimeNumberOrNot {

	public static void main(String[] args) {
		int num = 4;
		int prime = 1;


		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
				prime = 0;
			}
		}
		if (prime == 1) {
			System.out.println("is prime number" + " " + num);
		} else {
			System.out.println("Is not Prime Number" + " " + num);
		}
//		int []arr= {1,2,3,4,5};
//		for (int i = arr.length-1; i>=0; i--) {
//			System.out.println(arr[i]);
//		}

 }
}
