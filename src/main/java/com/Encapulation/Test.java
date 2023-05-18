package com.Encapulation;

public class Test {

	public static void main(String[] args) {
		Encapsulated kiran = new Encapsulated();
		System.out.println(kiran);
		kiran.setAge(27);
		System.out.println(kiran);
		
		Encapsulated hema= new Encapsulated("Hema",25,"female");
		System.out.println(hema);
		
//		using private access modifier we can cannot directly access,
//		so we want to use setters and getters method.
//		To inistalised the object  used the constructer
		
	}
}
