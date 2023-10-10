package com.method;

public class MethodRecrusion1 {
	static void recursive(int a) {
		System.out.println("number is :"+a);
		if(a==0) {
			return;
		}
		recursive(--a);
	}
	
	static void num(int nu) {
		for (int i = nu; i> 0; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
//		MethodRecrusion1.recursive(100);
		MethodRecrusion1.num(10);
	}

}
