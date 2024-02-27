package com.Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class PrintDuplicateAndRepetitionCount {
	public static void main(String[] args) {
		List<Integer> vc = new Vector<>();
		vc.add(1);
		vc.add(5);
		vc.add(4);
		vc.add(1);
		vc.add(2);
		vc.add(3);
		vc.add(5);
		vc.add(6);
		vc.add(4);

		System.out.println(vc);

		for (int i = 0; i < vc.size(); i++) {
			for (int j = i + 1; j < vc.size(); j++) {
				if (vc.get(i) == vc.get(i)) {

				}
			}
			System.out.println(vc.get(i));
		}
		System.out.println("\nExample 2 - Count all with frequency");
		Set<Integer> uniqueSet = new HashSet<>(vc);
		for (Integer temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(vc, temp));
		}
		
	}

}
