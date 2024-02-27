package com.Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;

public class HighestDuplicateNumInList {
	public static void main(String[] args) {

		List<Integer> ll = Lists.newArrayList(4, 5, 8, 7, 9, 2, 6, 5, 4, 8, 9);
		System.out.println(ll);
// print duplicates
//		for (int i = 0; i < ll.size(); i++) {
//			for (int j = i + 1; j < ll.size(); j++) {
//				if (ll.get(i) == ll.get(j)) {
//					System.out.println(" Duplicates values: " + ll.get(i));
//					System.out.println();
//				}
//
//			}
//
//		}
//		for (int i = 0; i < ll.size(); i++) {
//			for (int j = i + 1; j < ll.size(); j++) {
//				if (ll.get(i).equals(ll.get(j))) {
//					System.out.println(" Duplicates values: " + ll.get(i));
//				}
//
//			}
//
//		}

		Set<Integer> si = new HashSet<>();
		for (Integer in : ll) {
		
		System.out.println(si);
	}
	}

}
