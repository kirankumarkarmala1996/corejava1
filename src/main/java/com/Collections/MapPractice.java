package com.Collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapPractice {
public static void main(String[] args) {
//	List<Integer>list= new ArrayList<>();
//	List<String>liststr= new ArrayList<>();
	
	Map<Integer, String>map= new Hashtable<>();
//	to add the values into map using put method
	map.put(101, "kiran");
	map.put(102, "kumar");
	map.put(103, "ashok");
	map.put(104, "raj");
	map.put(105, "ram");
	
//	retrieval values from the map.values();
	Collection<String>values=map.values();
	for(String value:values){
		System.out.println(value);
	}
	System.out.println();
//	retrieval keys from the map
	Set<Integer>keys=map.keySet();
	for(Integer key:keys) {
		System.out.println(key);
	}
	System.out.println();
//	retrieval values based on the keys map.get();
	Set<Integer>keys1=map.keySet();
	for(Integer key:keys1) {
		System.out.println(key+">>>>>"+map.get(key));
	}
	
	System.out.println("===========");
//entryset returns getkeys and getvalues
	
	Set<Entry<Integer,String>>entries=map.entrySet();
	for (Map.Entry<Integer, String> entry : map.entrySet()) {
		Integer key = entry.getKey();
		String val = entry.getValue();
		System.out.println(key+">>>>"+val);
	}
	
	
	
}
}
