package com.sample;

import java.math.BigDecimal;

public class Premitativedatatype {
	public void dataTypes() {
		int max = 2147483647;
		int min = -2147483647;
		short shotmax = 32767;
		short shotmin = -32768;
		long longmax = 9223372036854775807L;
		long longmim = -9223372036854775808L;
		byte bytemax = 127;
		byte bytemin = -128;

	}

	public static void floatingPointDataType() {
		int value = 5;
		float value1 = 10f / 6f;// it occupies space 32 bit
		double value2 = 10d / 6d;// it occupies space 64 bit
		System.out.println("value " + value);
		System.out.println("value1 " + value1);
		System.out.println("value2 " + value2);
	}

	public static void calculatePercentage() {
		int value = 2565;
		double percentage = value * 0.36f;
		System.out.println(percentage);
	}
	
	public static void premetivedatatype() {
		boolean var =true;
		System.out.println(var);
		char character='\u00A4';
		System.out.println(character);
	}

	// how  can we round up the big decimals points
//	use in stringtype
	public static void decimals() {
		double x= 1.55;
		double y = 2.35;
		System.out.println(x+y);
		BigDecimal d1 = new BigDecimal("1.55");
		BigDecimal d2 = new BigDecimal("2.35");
		System.out.println(d1.add(d2));
	}
	
	
	
	public static void main(String[] args) {
//		floatingPointDataType();
//		calculatePercentage();
//		premetivedatatype();
		decimals();
	}
}
