package com.method;

public class Methodoverloading {

	public void login(String mail) {
		mail = "Abc@gmail.com";
		System.out.println(mail);
	}

	public void login(String mail, int password) {
		mail = "abc@gmail.com";
		password = 123156789;
		System.out.println(mail + " , " + password);
	}

	public void login(String mail, int password, String firstname) {
		mail = "def@gmail.com";
		password = 123456789;
		firstname = "kiran";

		System.out.println(mail + " ," + password + "," + firstname);
	}

	public void login(String mail, int password, String firstname, String lastname) {
		mail = "xyz@gmail.com";
		password = 123456789;
		firstname = "kiran";
		lastname = "kumar";
		System.out.println(mail + "," + password + "," + firstname + "," + lastname);

	}
//	can we overload the main method
//	yes we can overload the main method

	public static void main() {
		System.out.println("this is default main method");
	}

	public static void main(int id, String name) {
		id = 10;
		name = "kiran";
		System.out.println(id + "" + name);
	}

	public static void main(String[] args) {
		Methodoverloading movr = new Methodoverloading();
		movr.login(null);
		movr.login(null, 0);
		movr.login(null, 0, null);
		movr.login(null, 0, null, null);
		movr.main(0, null);
		movr.main();
//		syso("kiran");

	}

	public void login(String testdatasheet, String facebookid, int password) {
		password = 123456;

	}

	public void login(String whatsappid, Double accountbalance) {

	}

	public void login(String instagramid, Object password) {

	}

	public void login(Object password, String Naukrimailid) {

	}
//syso method still finding what is the use of the syso method
	public static String syso(String name) {

		return syso("This is syso method with different datatype");
	}

//	public void syso(int id) {
//		syso(10);
//
//	}

//	public   int syso() {
//		return syso() ;
//	}
	 void sooo(){
		 System.out.println("different method overloading with same name with different data type");
	 }
	 
	 
	public int num() {
		
		System.out.println("");
		int id = 10;
		return id;
	}
	
	public String num(String name) {
		name="kiran";
		
		return name;
	}

}
