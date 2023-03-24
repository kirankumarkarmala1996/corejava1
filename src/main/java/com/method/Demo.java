package com.method;

public class Demo {
	public static void main(String[] args) {
		String  str = "vijay simha\n reddy";
		int char_length=str.lastIndexOf("\n")+1;
//		System.out.println(char_length);
		System.out.println(str.substring(char_length, str.length()));
		
	}

}
