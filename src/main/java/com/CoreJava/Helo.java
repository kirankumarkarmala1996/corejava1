package com.CoreJava;

public class Helo {
	 private String name = "chris";
	 
	public Helo(String name) {
		super();
		name = name;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	public static void main(String... name) {
		Helo h = new Helo("jim");
		System.out.println(h.getName());
	}


	
}
