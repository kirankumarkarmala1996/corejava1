package com.string;

public class SingleTon {
	private static SingleTon singleTon = null;

	private SingleTon() {
	}

	public static SingleTon getInstance() {
		if (singleTon == null) {
			 singleTon = new SingleTon();
		}
		return singleTon;
	}

	public static void main(String[] args) {

		SingleTon ss = new SingleTon().getInstance();
		System.out.println(ss.hashCode());
		SingleTon s1=new SingleTon().getInstance();
		System.out.println(s1.hashCode());
	}

}
