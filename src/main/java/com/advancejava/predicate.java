package com.advancejava;

import java.util.function.Predicate;

public class predicate {
	
//	functional interface  are  four types 
//									1.function
	
	public static void main(String[] args) {
		//  here checking  the of the string in java
//		if string length is greater then 5 is returns true else false
		Predicate<String>checkLength=str->str.length()>5;
		System.out.println(checkLength.test("kiran k"));
	}

}
