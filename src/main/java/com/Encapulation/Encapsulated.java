package com.Encapulation;

public class Encapsulated {
	private String name;
	private int age;
	private String gender;

	public Encapsulated() {
		this.name = "kiran";
		this.age = 26;
		this.gender = "male";
	}

	public Encapsulated(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Encapsulated [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
