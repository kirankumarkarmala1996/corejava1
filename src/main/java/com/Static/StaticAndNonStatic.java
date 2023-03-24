package com.Static;

public class StaticAndNonStatic {
	int num;// non static variable(with out using static keyword)
//	**the main point to use the static keyword for memory management
	static String name; // static variable (By using static keyword is Called static variable)

	public static void main(String[] args) {
//		we can call the static variable without creating the  object 
		name = "kiran";// this is one to call the static variable
		System.out.println(name);

//	 Another way to call the static variable 
//		Using class name we can call the static variable
	System.out.println(	StaticAndNonStatic.name);

	
	
//	then how can we call the non static variable 
//	By creating object of the class
	
//	How can we create the object ?
//	By Using the class name we can create the object of the class
	StaticAndNonStatic ss= new StaticAndNonStatic();//(this is object)
	ss.num=100;
	System.out.println(ss.num);
	}

}
