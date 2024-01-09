package com.stringMethods;

public class PrintCharactersPresentedAtEvenPositions {
	public static void main(String[] args) {
		String java="HelloWorldJava";
		
		for (int i = 0; i < java.length()-1; i++) {
			if(i%2==0) {
				System.out.println("charater of index :"+i+" place of :"+java.charAt(i));
			}
		}
	}

}
