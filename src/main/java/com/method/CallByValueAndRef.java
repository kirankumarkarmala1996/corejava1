package com.method;

public class CallByValueAndRef {
	int a = 15;
	int b = 15;

	public int sum(int c, int d) {
		int e = c + d ;
		return e;
	}

	public void add(int f, int g) {
		System.out.println("total=" + (f + g));
	}

	public static void main(String[] args) {
		CallByValueAndRef call = new CallByValueAndRef();
		int h=call.sum(5, 2);//call by value
		System.out.println(h);
		call.add(call.a, call.b);//call by reference
	}

}
