package com.IoOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
	public static void main(String[] args) throws IOException {
		File file = new File("./FileWriter.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		String st= "hello fileWriter";
		FileWriter fw = new FileWriter(file);
//		fw.write((int)st.length());
//		fw.write(st);
//		fw.write(st.toCharArray());
//		
		for (int i = 0; i < st.length(); i++) {
		fw.write(st.charAt(i));
		}
		
		fw.flush();
		fw.close();
	}

}
