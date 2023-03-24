package com.CoreJava;

public class MaxNumber{
	public static void main(String[] args) {
		int i =100;										//true && true = true
		int j = 200;									//true && false = false
		int k =300;										//false && true = false
//		i is greater then j and i is greater then k 	//false && false = false
		if(i>j&&i>k) {//false && false = false
			System.out.println("i is greater ");
		}
		else if(j>k&&j>i) {
			System.out.println("j is greater");
		}
		else if(k>i&&k>j) {
			System.out.println("k is greater");
		}else if(i==j&&j==k) {
			System.out.println("all the three numbers all equal");
		}else if (j==k) {
			System.out.println("j and k both are equal");
		}else if(k==i) {
			System.out.println("k and i both are equal");
		}
		else  {
			System.out.println("entered all three numbers are not same");
		}
	}

}
