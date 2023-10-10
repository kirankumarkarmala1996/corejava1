package com.string;

import org.apache.commons.lang3.StringUtils;

import io.netty.util.internal.StringUtil;

public class RemoveThespace {
	public static void main(String[] args) {
		String str= "            This is redeculus in     java    ;";
		String trim=str.trim();
//		System.out.println(trim);// it will remove the cornor spaces

		String strip=str.strip();
//		System.out.println(strip);
		
//		System.out.println(str.replaceAll("\\s", ""));//  \\s it will remove the space one by one
//		System.out.println(str.replaceAll("\\s+", ""));//it is collect space togeather and remove once
		
		
//		by using utils it will also remove the white space
		String utls=StringUtils.deleteWhitespace(str);
		System.out.println(utls);
		
		StringBuilder sbl = new StringBuilder(str);
	}

}
