package com.constructor;


public class Child  extends ThisVSsuper {
		String s = "child veriable";
		
		public  void m1() {
			System.out.println(s);
			System.out.println(this.s);
			System.out.println(super.s);
		}
		
	public static void main(String[] args) {
		Child c = new Child();
			c.m1();
		
	
	}
}
