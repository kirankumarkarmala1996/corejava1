package com.IoOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMethods {
	public static void main(String[] args) throws IOException {
		File file = new File("./fileReader.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file created succesfully");
		}
		FileReader fr = new FileReader(file);
		int asciicode;
		String text = " ";
		System.out.println(fr.read());// read() method read only one character
		System.out.println(asciicode=fr.read());// read() method read only one character
		
		System.out.println("===========");
		while ((asciicode = fr.read()) != -1) {
			text += String.valueOf((char) asciicode);
			System.out.println(asciicode=fr.read());//print asciicode values
		}
		System.out.println(text);
		
	fr.close();

	}

}
