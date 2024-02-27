package com.Collections;

import java.util.List;

import com.beust.jcommander.internal.Lists;

public class SumAndAvgNumberInList {
	public static void main(String[] args) {
//		ArrayList<Integer>al= new ArrayList<>();
//		al.add(4);
//		al.add(5);
//		al.add(0);
//		al.add(9);
//		al.add(8);
//		al.add(10);
		List<Integer>al=Lists.newArrayList(4,5,0,9,8,10);

		System.out.println(al);
//		get the value by index
//		System.out.println( al.get(5));
		
	System.out.println(al.contains(6));
		int sum =0,avg;
//Using for loop
		for(int i=0;i<al.size();i++) {
			
			sum+=al.get(i);
		}
		System.out.println(sum);
		
//		Avg num present in the list
		avg=sum/al.size();
		System.out.println(avg);
		
		
		
	}

}
