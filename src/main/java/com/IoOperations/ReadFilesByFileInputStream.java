package com.IoOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFilesByFileInputStream {
	static File file;

	public static void main(String[] args) throws IOException {
		File file = new File("./Test.txt");
		if (!file.exists())
			file.createNewFile();
		System.out.println("file created succesfully");
//
		FileInputStream stream = new FileInputStream(file);
//		System.out.println(" ======== ");
		int asciicode;
		System.out.println(stream.read());
		while ((asciicode = stream.read()) != -1) {
			System.out.println(asciicode);
//			System.out.print((char) asciicode);
		}
////		To avoid the data  leacage
		stream.close();
//		readFileUsingScanner();

	}

	public File IsEmpty() throws IOException {

		file = new File("./Test.txt");
		if (!file.exists()) {
			file.createNewFile();
		} else if (file == null) {
			System.out.println("pass the currect path ");
		}
		return file;
	}

	public static void creatFile() throws IOException {
		file = new File("./Test.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file created succesfully");
		}
	}

	public static void readFileUsingFileInputStream() throws IOException {
		file = new File("./Test.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file created succesfully");
		}
//		creatFile();
		FileInputStream stream = new FileInputStream(file);
		String text = " ";
		int asciicode;
		if ((stream.read()) != -1) {
			while ((asciicode = stream.read()) != -1) {
				text += String.valueOf((char) asciicode);
//				System.out.print((char) asciicode);
			}
		}
		System.out.println(text);
//		To avoid the data  leacage
		stream.close();
	}

	public static void readFileUsingScanner() throws IOException {
		file = new File("./Test.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file created succesfully");
		}
		String text = " ";
//		or

//		String string = new String();
//		Scanner scanner = new Scanner(new FileInputStream(file));
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
//			\n start new line
			text += scanner.nextLine() + "\n";
		}
		System.out.println(text);
	}

}
