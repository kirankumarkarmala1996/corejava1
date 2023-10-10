package com.chaning;

public class MethodChaning {
	public void ram() {
		System.out.println("ram");
	}
	
	public void ramesh() {
		ram();
		System.out.println("ramesh is calling  ram");
	}
	
	public void kiran() {
		ramesh();
		System.out.println("kiran is calling ramesh");
	}
	
	
	public static void main(String[] args) {
		
		MethodChaning mc = new MethodChaning();
		mc.kiran();
	}

}
