package com.string;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String str = "Kiran Kumar";
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
//			System.out.println(ch);
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[i]);
					break;
				}
			}
		}

	}

}
