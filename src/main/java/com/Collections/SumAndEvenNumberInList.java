package com.Collections;

import java.util.ArrayList;

public class SumAndEvenNumberInList {
	
	public static void main(String[] args) {
		ArrayList<Integer>al= new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(0);
		al.add(9);
		al.add(8);
		al.add(10);
		System.out.println(al);
		
		int sum=0;
		for(int i=0;i<al.size();i++) {
		if(al.get(i)%2==0) {
		sum+=al.get(i);
		}		
		}
		System.out.println("sum of even num :"+sum);
	}
}
