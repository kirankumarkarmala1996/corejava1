package com.CoreJava;

public class Vote {
	
	 static int age ;
	 
	 
	public void age() {
		
		if(age>=18 && age<=60) {
			System.out.println("Your eligible to vote");
		}if(age<18) {
			System.out.println("Your not eligible to vote");
		}if(age>=60) {
			System.out.println("Thanks for coming to senior citizens");
		}
		
		else {
			System.out.println("welcome to vote");
		}
	}
	public static void main(String[] args) {
			Vote v = new Vote();
			v.age();
				
		
	}

}
