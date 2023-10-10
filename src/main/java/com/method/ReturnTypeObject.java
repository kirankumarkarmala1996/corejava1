package com.method;

class Student {

}

class Employee {

}

public class ReturnTypeObject {

	Employee m1() {
		Employee emp = new Employee();
		return emp;
	}

	Student m2() {
		Student st = new Student();
		return st;
	}

	public static void main(String[] args) {
		ReturnTypeObject rtm = new ReturnTypeObject();

		System.out.println(rtm.m1());
		System.out.println(rtm.m2());
	}

}
