package com.advancejava;

public interface Client {
	
	 default void  client(String str) {
		str="Invalid '@FunctionalInterface' annotation;/n Manager is  a functional interface";
		System.out.println("if we declear the abstract method in normal interface and extends to functional interface it will throw the error"+" "+str );
	}
}
