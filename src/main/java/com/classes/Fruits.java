package com.classes;

public enum Fruits {
	MANGO(50),
	BANANA(40),
	APPLE(110), 
	PINEAPPLE(120),
	KIWI(150);
	
	int  levelOfDelicious;
	
	Fruits(int levelOfDelicious){
		this.levelOfDelicious=levelOfDelicious;
	}
}
