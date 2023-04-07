package com.method;

public class MethodReuseable {
	public static void main(String[] args) {
		
		loop(1, 10);
		System.out.println("******************");
//	if you print 1 to 10 number we want to write main method
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

	}

//	methods
//	By using method we can make reusable the method again and again
	public static void loop(int startValue, int endValue) {
		while(startValue<=endValue) {
			System.out.println(startValue);
			startValue++;
		}
	}

}
