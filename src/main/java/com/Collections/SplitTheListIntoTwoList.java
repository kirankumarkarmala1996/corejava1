package com.Collections;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

import com.google.common.collect.Lists;

public class SplitTheListIntoTwoList {
	public static void main(String[] args) {
//		LinkedList<Integer>ll= new LinkedList<>();
//		ll.add(4);
//		ll.add(5);
//		ll.add(0);
//		ll.add(9);
//		ll.add(8);
//		ll.add(10);
// list array
		List<Integer> list = Lists.newArrayList(4, 5, 0, 9, 8, 10);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.indexOf(0));

		List<Integer> first = new Stack<>();
		List<Integer> second = new Vector<>();
		int size = list.size();
		
		for(int i=0;i<size/2;i++) {
			first.add(list.get(i));
		}
		System.out.println(first);
		
		for(int i=size/2;i<size;i++) {
			second.add(list.get(i));
		}
		System.out.println(second);

	}

}
