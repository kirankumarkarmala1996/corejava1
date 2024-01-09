package com.stringMethods;

public class CountingFrequencyOfCharacter {
	public static void main(String[] args) {
		
		String  name="HelloJava";
		int count=0;
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)=='l') 
				count++;
				System.out.println(count);
		
			
		}
		
	}

}
