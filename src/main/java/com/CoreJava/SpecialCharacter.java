package com.CoreJava;

public class SpecialCharacter {
	 public static void main( String[] arg ) {
	        String str = "aQt4512m@!%n";
	        
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

	        
//	        String chars = str.replaceAll( "[\\W\\d]", "" );
//	        System.out.println("chars :"+chars );
//
//	        String special = str.replaceAll( "\\w", "" );
//	        System.out.println("Specialcharacter :" +special );
//
//	        String numbers = str.replaceAll( "\\D", "" );
//	        System.out.println("numbers :"+ numbers );
	    }
	 
	 

}
