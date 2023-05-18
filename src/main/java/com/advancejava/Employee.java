package com.advancejava;

public class Employee  implements Manager{
	// abstract method is overriden
	@Override
	public void empName(String id, String name) {
		id="100";
		name="kiran";
		System.out.println(id+"/n"+name);
	}	
	
	
	public static void main(String[] args) {
	Manager.empSalary();
	
	Employee emp = new Employee();
	emp.client("calling the default method in client interface");// calling the default method in client interface
	emp.empDetails();

	
	
	
	}


	

	

}
