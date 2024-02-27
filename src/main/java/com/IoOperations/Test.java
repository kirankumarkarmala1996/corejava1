package com.IoOperations;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(01);
		e1.setName("kiran");
		e1.setFee(14000);

		Employee e2 = new Employee();
		e2.setId(02);
		e2.setName("ashok");
		e2.setFee(15000);

		Employee e3 = new Employee();
		e3.setId(03);
		e3.setName("kumar");
		e3.setFee(16000);

//		System.out.println(e1.getId());
//		System.out.println(e1.getName());
//		System.out.println(e1.getFee());

		Employee[] employee = new Employee[] { e1, e2, e3 };
// way one
//		for(Employee emp :employee) {
//			System.out.println("============");
//			System.out.println(emp.getId());
//			System.out.println(emp.getName());
//			System.out.println(emp.getFee());
//		}
	
// way two		
		List< Employee>list= new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		for(Employee emp:list) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getFee());
		}
		
		
		
		

	}

}
