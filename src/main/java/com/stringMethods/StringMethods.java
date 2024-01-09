package com.stringMethods;

public class StringMethods {
	public static void main(String[] args) {

		String name = "kirankumar";
		char ch = name.charAt(4);
		System.out.println(ch);
//		fetching the first character
		System.out.println("Character at 0 index :"+name.charAt(0));
		
//	fetching the last character from the given Strings
		System.out.println("Character at 9 index :"+name.charAt(name.length()-1));

	}

}
