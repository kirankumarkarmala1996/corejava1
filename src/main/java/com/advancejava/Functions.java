package com.advancejava;

import java.util.function.Function;

public class Functions {

//	function interface are four types
	// 3.function--both input and output
	public static void main(String[] args) {
		Function<Integer, String>getint=t->t*10+" multiplied by  * 10";
		System.out.println(getint.apply(5));
	}

}
