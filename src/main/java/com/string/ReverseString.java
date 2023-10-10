 package com.string;

public class ReverseString {
	public static void main(String[] args) {
		String st, st1, rev = "";
		st = "hello";
		st1 = "world";
		int n = 100;
		char ch ;
//		System.out.println(st+st1);
//		System.out.println(st.concat(st1));
//		System.out.println(st+n);

//	using inbuilt function
//		StringBuilder s = new StringBuilder(st);
//		StringBuilder ss = s.reverse();
//		System.out.println(ss);

//		rev = " ";
//		char ch[] = st.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			rev += ch[i];
//			System.out.println(rev);
//		}
		
// using foreach loop

//		for(String str:st) {
//			rev=str+rev;
//			
//		}
		
// using for loop reverse string
//		for (int i=0;i<st.length();i++) {
//			ch=st.charAt(i);
//			rev=ch+rev;
//		}
//		System.out.println(rev);
		
		
// Reverse the string using tocharArray
		char[] c =st.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}

}
