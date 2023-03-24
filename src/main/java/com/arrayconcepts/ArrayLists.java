package com.arrayconcepts;

import java.util.ArrayList;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al.size());// 0
		al.add(10);// 0
		al.add(100);// 1
		al.add(101);// 2
		al.add(110);// 3
		al.add(1000);// 4
		System.out.println(al);// [10, 100, 101, 110, 1000]
		System.out.println(al.get(3));// 110
		al.remove(3);
		System.out.println("after remove");
		System.out.println(al);
		System.out.println(al.get(3));// 1000
		System.out.println("==========");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));// 3
		}
		System.out.println("==========");
		al.add(2050);
		System.out.println(al.get(4));
		System.out.println("==========");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));// 4
		}

		System.out.println("=====Stringtype Arraylist using generics=====");
		ArrayList<String> name = new ArrayList<>();
		name.add("kiran");// 0
		name.add("kumar");// 1
		name.add("kishor");// 2
		System.out.println(name.get(0));
		System.out.println(name.get(1));
		System.out.println(name.get(2));

		System.out.println();
		System.out.println("=====using forloop we will get all the names=====");
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
			
		}
		System.out.println("=====we can print in reverse also=====");
		for(int j=name.size()-1;j>=0;j--) {
			System.out.println(name.get(j));
		}
		System.out.println("=====using foreachloop we will get all the name=====");
		for(String str :name) {
			System.out.println(str);
		}
		System.out.println("=======integer type arraylist using generics========");
		ArrayList<Integer> age = new ArrayList<>();
		age.add(20);
		age.add(25);
		age.add(30);
		System.out.println(age.get(0));
		System.out.println("=====using forloop we will get all the Age=====");
		for(int k=0;k<age.size();k++) {
			System.out.println(age.get(k));
		}
		System.out.println("=====using forloop we will get all the Ages in reverse=====");

		for(int m=age.size()-1;m>=0;m--) {
			System.out.println(age.get(m));
		}
		
		System.out.println("=====using foreachloop we will get all the Age=====");
		for(Integer in:age) {
			System.out.println(in);
		}
		System.out.println("=====using forEach method we will get all the Age=====");
		age.forEach((a)->System.out.println(a));//if want to use this lambda expression we want change java version 1.7 to 1.8
		
		System.out.println("=====using forloop print the numbers=====");
		for(int d=0;d<=5;d++) {
			for(int f=0;f<=5;f++) {
				System.out.print(d+""+f+" ");
			}
			System.out.println();
		}
		
		
	}

}
