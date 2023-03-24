package com.casting;

public class ImplicitingCasting {
	public static void main(String[] args) {
//		byte b = 10;
//		int i = b;//byte to int 
//		System.out.println(i);
		
		byte b1= 15;
		short s= b1;
		int in =s;
		long l =in;
		float f =l;
//		when  we compare to float double is fast and store large num of values
		double d = f;
		System.out.println(s);
		System.out.println(in);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
	}

}
