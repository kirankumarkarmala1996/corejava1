package com.string;

import java.util.HashMap;

public class AccurenceOfEachCharacterINString {
	public static void main(String[] args) {

		String str = "kirankumar";

		HashMap<Character, Integer> map = new HashMap<>();
//	
//	  for(int i=str.length()-1;i>0;i--){ 
//		  if(map.containsKey(str.charAt(i))){ 
//	int count=map.get(str.charAt(i));
//	map.put(str.charAt(i),++count); 
//	} else{
//	  map.put(str.charAt(i),1);
//	  } } 
//	  System.out.println(map);

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);

	}

}
