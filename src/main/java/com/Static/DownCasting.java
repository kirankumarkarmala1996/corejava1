package com.Static;


class DownCasting {
	
	void cast() {
		System.out.println("downcasting");
	}

}
  class Test extends DownCasting{
	  void cast1() {
		 
		  System.out.println("test class");
	  }
	 public static void main(String[] args) {
		DownCasting d = (DownCasting)new Test();//type casting
		Test t = (Test)new DownCasting();//type casting (by using this we can call the both classes
		
		
		
		
	}
	
}


class Animal { }  
class Dog4 extends Animal {  
  static void method(Animal a) {  
       Dog4 d=(Dog4)a;//downcasting  
       System.out.println("ok downcasting performed");  
  }  
   public static void main (String [] args) {  
    Animal a=new Dog4();  
    Dog4.method(a);  
  }  
}  
