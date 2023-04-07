package com.Loops;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=1234;
		int sumofvalue=0;
		
		while(true){
			sumofvalue=sumofvalue+num%10;
			num=num/10;
			if(num<10) {
				break;
			}
		}
		sumofvalue=sumofvalue+num;
		System.out.println(sumofvalue);
	}

}
