package com.Collections;

import java.util.ArrayList;

import com.google.common.collect.Lists;

public class MergeTheTwoList {

	public static void main(String[] args) {
		ArrayList<Integer> list = Lists.newArrayList(4, 9, 8);
		ArrayList<Integer> list1 = Lists.newArrayList(5, 0, 10);

		ArrayList<Integer> al = new ArrayList<>();
		al.addAll(list1);
		System.out.println(al);
		al.addAll(0, list);
		System.out.println(al);

	}

}
