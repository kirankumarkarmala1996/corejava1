package com.advancejava;

@FunctionalInterface
public interface Manager extends Client {
	// abstract method
	void empName(String id, String name);
	
	// default method
	 default void empDetails() {
		 System.out.println("default methods in managerfunctionainterface");
	 }
	 
	 // static method
	 static void  empSalary() {
		 System.out.println("empSalary static method in managerfunctionalinterface");
	 }
	 
	
	
	
	

}
