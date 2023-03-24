package com.arrayconcepts;

import java.util.ArrayList;

public class Methods {
	int id;
	String name;

//	public Methods kiran(int id, String name) {
//		this.id = id;
//		this.name = name;
//		return this;
//	}

//  some input some return
	public int add(int a, int b, int c) {
		a = 10;
		b = 20;
		c = a + b;
		return c;
	}
//No input some  return
	public int add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

//	some input some return
	public String names(String name) {
		if (name.equals("kiran")) {
			return "palamaner";
		} else if (name.equals("mahesh")) {
			return "chittoor";
		} else if (name.equals("toni")) {
			return "chennai";
		} else if (name.equals("Assif")) {
			return "warangal";
		} else {
			return "name not found";
		}
	}

	public ArrayList<String> studentList(String month) {
		ArrayList<String> student = new ArrayList<String>();

		if (month.equals("feb")) {
			student.add("kiran");
			student.add("toni");
			student.add("mahesh");
			student.add("assif");
		} else if (month.equals("Aug")) {

			student.add("madhu");
			student.add("ashok");
		} else {
			System.out.println("batch not found");
		}
		return student;
	}

	public String[] weekdays() {
		String day[] = new String[7];
		day[0] = "monday";
		day[1] = "tuesday";
		day[2] = "wednesday";
		day[3] = "thursday";
		day[4] = "friday";
		day[5] = "saturday";
		day[6] = "sunday";
		for(String ss:day) {
			System.out.println(ss);
		}
		return day;
	}

//	some input some return
	public String hello(String Teacher) {
//		for String Default value is null
//		fir Int Default value is Zero

//		in this teacher does not belongs to any subject it returns null value
		if (Teacher.equals("English")) {
			return "aruna mam";
		} else if (Teacher.equals("Telugu")) {
			return "Ganesh sir";
		}
		return null;
	}

	public static void main(String[] args) {
		Methods d = new Methods();
//		System.out.println(d.names("mahesh"));
//		System.out.println(d.studentList("feb"));
		d.weekdays();
//		System.out.println(st[0]+" "+st[1]);
		System.out.println(d.hello("English"));

	}
}
