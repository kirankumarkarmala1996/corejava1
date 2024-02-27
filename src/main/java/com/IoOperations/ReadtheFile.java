package com.IoOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadtheFile {

	static File file;

	public static void main(String[] args) throws IOException {
		File file = new File("./example.txt");
//		file.createNewFile();
//		if(file.exists()) 
//			file.delete();
//		file.createNewFile();

//		if(!file.exists())
//		file.createNewFile();
//		file.delete();

//		ReadtheFile rf = new ReadtheFile();
//		rf.createFileAndRead();

//		createFileAndRead();

		file = new File("./Test.txt");
		if (!file.exists())
			file.createNewFile();
////		System.out.println("file created succesfully");
//		FileInputStream fis = new FileInputStream(file);
////		System.out.println(" ======== ");
//		int asciicode;
//		String line = "";
//		while ((asciicode = (char) fis.read()) != -1) {
//			line+= String.valueOf((char) asciicode);
//		}
//		System.out.println(line);
		int asciicode;
		String text=" ";
		
		FileReader fir= new FileReader(file);
		while((asciicode=fir.read())!=-1) {
			text+=String.valueOf((char)asciicode);
		}
		System.out.println(text);

		fir.close();

	}

	public static void createFile() throws IOException {
		file = new File("./Test.txt");

		if (!file.exists()) {
			file.createNewFile();

		} else if (file.exists()) {
			file.delete();
			file.createNewFile();
		} else {
			System.out.println("pass the correct path");
		}
	}

// four ways to read the file
	public static void createFileAndRead() throws IOException {
//		createFile();
		file = new File("./Test.txt");
		if (!file.exists())
			file.createNewFile();
		System.out.println("file created succesfully");
		FileInputStream fis = new FileInputStream(file);
//     Read method reads the character by character 
//		and if we read directlu fis.read(); it gives asciicode we need to convert char values
		System.out.println(fis.read());

//		convert asciicode into char values
		System.out.println((char) fis.read());

		System.out.println(" ======== ");
		int asciicode;
		while ((asciicode = (char) fis.read()) != -1) {
			System.out.println((char) asciicode);
		}

		fis.close();

	}

}
