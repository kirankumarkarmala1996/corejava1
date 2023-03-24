package com.casting;

public class ExplicitiesCasting {
	public static void main(String[] args) {
		double d = 122;
		float f =(float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
	}

}
