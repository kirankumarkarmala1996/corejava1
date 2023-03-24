package com.CoreJava;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sdfgh6788$%^&";
		char ch[]=str.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if(ch[i].)
//		}
		char[] chArr = str.toCharArray();
		Character myChar = '\0';
		        
		for(int i=0;i<chArr.length;i++) {
		    myChar = '\0';  
		    if(chArr[i]>=65 && chArr[i]<=122) {
		        myChar =chArr[i];   
		    }
		        
		    String tr = myChar.toString();
		    String dr = tr.replaceAll("\\W","");
		    System.out.print(dr);
		}
	}

}
