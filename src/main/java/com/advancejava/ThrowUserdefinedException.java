package com.advancejava;

public class ThrowUserdefinedException  {
	
	public static final String name="RAM SEETHA LAKSHMANA HUNAMTHA";
	public static void main(String[] args)  {
		try {
		if(name.contains("RAM")) {
			throw new UserDefinedException("please pass the currect name");
		}
		}catch (UserDefinedException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
