package com.IoOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
	public static void main(String[] args) throws IOException {
		File file = new File("./bufferWriter.txt");
//		if (file.exists()) {
//			file.delete();
//			file.createNewFile();
//		}
		String st = "hello buffer writer";

//To write the data into the files
//		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//		bw.write((int)st.length());
//		bw.write(st);
//		bw.write(st.toCharArray());
		
//		for (int i = 0; i < st.length(); i++) {
//			bw.write(st.charAt(i));
//		}

		// to read the data from files
		BufferedReader bf = new BufferedReader(new FileReader(file));
		String line = " ";
		String text = " ";

		while ((line = bf.readLine()) != null) {
			text += line + "\n";
		}
		System.out.println(text);
		
		String newtext="hello world";
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(text+newtext);

		bw.flush();
		bf.close();
		bw.close();
	}
}
