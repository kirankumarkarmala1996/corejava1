package com.CoreJava;

public class FormNewLine {
	public static void main(String[] args) {
		
		String txt = "Hello\rWorld!";
	    System.out.println(txt);
	    
	  //To form new Line (\n )
		String str ="Hello\nWOrld";
		System.out.println(str);
		
	// Instead of tab using this (\t)	
		String st ="Hello\tWOrld";
		System.out.println(st);
		
//		Instead of backspace using this(\b)
		String sts ="Hel\blo WOrld";
		System.out.println(sts);
	}
}
