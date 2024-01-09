package com.stringMethods;

public class PrintCharactersPresentedAtOddPositions {
	public static void main(String[] args) {
		
	
	String name= "kirankumar";
	
	for (int i = 0; i < name.length()-1; i++) {
		if(i%2!=0)
		System.out.println("odd position value :"+i+" value :"+name.charAt(i));
	}
	
	}
	
}
