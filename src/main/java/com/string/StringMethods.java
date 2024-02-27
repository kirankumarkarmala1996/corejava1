package com.string;

import java.util.HashMap;

public class StringMethods {
	
	
	public static void main(String[] args) {
		
		String str = " java is super  ";
		String str1 = "java is super";

		// we get get value by passing index
		char ch = str.charAt(0);
		System.out.println(ch);

//		IntStream instr=str.chars();
//		instr.anyMatch();
		String st = new String("java is super ");
		System.out.println(st);

//		compare the two strings using '==' double equales is used to  reference address comparesion 
		System.out.println(str == st);// flase
		System.out.println(str == str1);

		// .equals() method
		System.out.println(str.equals(str1));// .equals is used to content0 comparision

		// .equalsIgnoreCase
		System.out.println(str.equalsIgnoreCase(str1));// .equalIgnoreCase is Content comparesioin

		// toUpperCase() methods
		System.out.println(str.toUpperCase());

		// toLowerCasemethods
		System.out.println(str.toLowerCase());

		// startWith() methods
		System.out.println(str.startsWith("j"));// true
		// endsWith() methods
		System.out.println(str.endsWith("er"));// true
		// length() methods
		System.out.println(str.length());

		// trim method is use to remove first(leading) and end(traling)space.
		System.out.println(str.trim());

		// to charArray() method
//		to make the entire string to character
		char[] ch1 = str.toCharArray();

//		indexof() is used to character is present at which place
		System.out.println(str.indexOf("a"));

		System.out.println(str.indexOf("is"));// it display only the first character position

		// subString is used to make another string from given string
		System.out.println(str.substring(3));
		// its print between 5 and 9 values
		System.out.println(str.substring(5, 10));

		// split() method is used to make into piceses
		String[] ss = str.split(" ");
		for (String string : ss) {
			System.out.println(string);

		}
		// charAt method is used to print the value by passing the index number
		System.out.println(str.charAt(4));

		// replace method is replace the value
		System.out.println(str.replace("j", "hh"));

//		valueOf();
//		convert String to int
		String num = "401";
		int nn = Integer.valueOf(num);
		System.out.println(nn);

//		convert int to string
		int number = 100;
		String s1 = String.valueOf(number);
		System.out.println(s1);

//		isEmpty() method it check is empty without removing the white spaces
		System.out.println(str.isEmpty());

//		isBlank method it check is blank with  removing the  white space
//		System.out.println(str.isBlank());

		reverseString("hello");
	}

	public static void numberOfCharaterInAString(String str) {

		int count = 0;
		char ch = 0;

		for (int i = 0; i < str.length(); i++) {
			ch = str.trim().charAt(i);
			if (ch != ' ') {
				count++;
			}
			System.out.println(count + " " + ch);
		}

	}

	public static void numberOfWordsInAString(String str) {

		String[] arr = str.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr.length != ' ') {
				count++;
			}
			System.out.println(count + " " + arr[i]);
		}
	}

	public static void accuranceOfEachCharacter(String str) {

		HashMap<Character, Integer> map = new HashMap<>();
		System.out.println(str.length());
		for (int i = str.length() - 1; i > 0; i--) {
			if (map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
	}

	public static void reverseString(String str) {
		char ch;
		String rev = "";
//		for(int i=str.length()-1;i>=0;i--) {
//			ch=str.charAt(i);
//			rev+=ch;
//		}
//		System.out.println(rev);

//		for (int i = 0; i < str.length(); i++) {
//			ch=str.charAt(i);
//			rev=ch+rev;
//		}
//		System.out.println(rev);

		char[] cc = str.toCharArray();
		for (int i = cc.length-1; i >= 0; i--) {
			System.out.print(cc[i]);
		}
		
	}
}
