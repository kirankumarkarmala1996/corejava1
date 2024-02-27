package com.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {
	public static void main(String[] args) {
		//it allows only one null value it doesn't allow duplicate values
		Set<Integer>set= new HashSet<>();
		set.add(10);
		set.add(12);
		set.add(12);
		set.add(null);
		set.add(null);
		System.out.println(set);
		set.remove(10);
		System.out.println(set);
		HashSet<Integer>hs= new HashSet<>();
		hs.add(11);
		hs.add(01);
		System.out.println(hs);
		hs.remove(10);
		System.out.println(hs);
		
		
		Set<String>lhs=new LinkedHashSet<>();
		lhs.add("kiran");
		lhs.add("hello");
		lhs.add("hello");
		lhs.add("demo");
		System.out.println(lhs);
		lhs.remove("hello");
		System.out.println(lhs);
		
		
		LinkedHashSet<String>lh= new LinkedHashSet<>();
		lh.add("hello");
		lh.add(null);
		lh.add(null);
		lh.add("raj");
		lh.add("raj");
		System.out.println(lh);
		
		
	}

}
