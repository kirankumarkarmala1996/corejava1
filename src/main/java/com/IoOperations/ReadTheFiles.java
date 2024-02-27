package com.IoOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTheFiles {

	static File file;
	
	int asciicode;
	static String text = " ";

	public File createFile(String path) throws IOException {
		file = new File("./Reader/Text");
		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}
		return file;
	}

	public void ReadTheFile(String path) throws IOException {
		createFile(path);
		FileInputStream fis = new FileInputStream(file);
		// it will gives character by character
		fis.read();

		// while loop
		while ((asciicode = fis.read()) != -1) {
			System.out.println((char) asciicode);
		}

	}

	public void ReadTheFileAndClose(String path) throws IOException {
		createFile(path);
		FileInputStream fis = new FileInputStream(file);
		while ((asciicode = fis.read()) != -1) {
			System.out.println((char) asciicode);
		}

		fis.close();

	}

	public void ReadTheFileUsingFIS(String path) throws IOException {

		createFile(path);
		FileInputStream fis = new FileInputStream(file);

		while ((asciicode = fis.read()) != -1) {
			text += String.valueOf((char) asciicode);
		}
		System.out.println(text);
		fis.close();

	}

	public void ReadTheFileUsingSCN(String path) throws IOException {
		createFile(path);
		Scanner scn = new Scanner(file);
//		// hasNext method is find the nextLine
//		while (scn.hasNext()) {
//			// To read the character by character
//			System.out.println(scn.next());
//		}
		//hasNextLine method is find the next Token
		while(scn.hasNextLine()) {
			System.out.println(scn.nextLine());
		}
		scn.close();
	}
	
	
	public void readTheFileUsingFileReader(String path) throws IOException {
		createFile(path);
		
		FileReader fir= new FileReader(createFile(path));
		while((asciicode=fir.read())!=-1) {
			text+=String.valueOf((char)asciicode);
		}
		System.out.println(text);
		fir.close();
	}
	
	

	public static void main(String[] args) throws IOException {
		 File file = new File("./Reader.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		int asciicode;
		
		FileReader fir= new FileReader(file);
		while((asciicode=fir.read())!=-1) {
			text+=String.valueOf((char)asciicode);
		}
		System.out.println(text);
		fir.close();
	}

}
