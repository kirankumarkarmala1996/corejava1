package com.advancejava;

import java.util.function.Supplier;

public class Suppliers {
//	functional interface have four methods
	// suppliers--only out put
	public static void main(String[] args) {
		Supplier<Double>getRandaNum=()->Math.random();
		System.out.println(getRandaNum.get());
//		0.8755383137136893
//		0.6172838019586203



	}

}
