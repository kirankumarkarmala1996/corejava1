package com.Static;

public class CallByReference {
	int a ;
	int b;
	
	
	public static void main(String[] args) {
		
		CallByReference cbr = new CallByReference();
	//we want to pass the value by  object reference
	// bcz  of variables are global variable		
		cbr.a=10;
		cbr.b=20;
		
		cbr.swap(cbr);
		
	}
	
	public void swap(CallByReference t) {
		int temp;
		temp = t.a;//10
		t.a=t.b;//20
		t.b=temp;//
	}

}
