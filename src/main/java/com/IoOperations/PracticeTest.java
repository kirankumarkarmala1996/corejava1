package com.IoOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class PracticeTest {
//four ways to read the files
//	FileReader
//	FileInputStream
//	Scanner
//	BufferedReader

//	three ways to write the data into files

	public static File createFile() throws IOException {
		File file = new File("./practiceTest");
		if (!file.exists()) {
			file.createNewFile();

		}
		return file;
	}

	public static void numberOfLinePresentInTextFile() throws IOException {
		File file = new File("./practiceTest");
		if (!file.exists()) {
			file.createNewFile();

		}
		String string = "";
		int count = 0;
//		FileReader fr = new FileReader(file);
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			string = scan.nextLine();
			count++;
		}
		System.out.println(count);

		scan.close();
//		fr.close();

//		FileReader fr = new FileReader(file);
//
//		int asciicode;
//		String text = " ";
//		while ((asciicode = fr.read()) != -1) {
//			text += String.valueOf((char) asciicode);
//		}
//		System.out.println(text);

	}

	public static void countNoOfWordsInTextFile() throws IOException {
		File file = new File("./practiceTest");
		if (!file.exists()) {
			file.createNewFile();
		}

		int asciicode;
		String text = "";
		String[] words;
		int countwords = 0;
		char ch;

		BufferedReader br = new BufferedReader(new FileReader(file));
		while ((text = br.readLine()) != null) {
			words = text.split(" ");
			countwords += words.length;
		}
		System.out.println(countwords);
		br.close();
	}

	public static void accurenceOfEachCharacterInTextFile() throws IOException {
		File file = new File("./practiceTest");
		if (!file.exists()) {
			file.createNewFile();
		}
		String line = " ";
		String text = " ";
		int asciicode;

		FileReader fr = new FileReader(file);
		while ((asciicode = fr.read()) != -1) {

			line += String.valueOf((char) asciicode);
		}
//		System.out.println(line);
		HashMap<Character, Integer> map = new HashMap<>();
//		
		for (int i = 0; i < line.length(); i++) {
			if (map.containsKey(line.charAt(i))) {
				int count = map.get(line.charAt(i));
				map.put(line.charAt(i), ++count);
			} else {
				map.put(line.charAt(i), 1);
			}
		}
		System.out.println(map);

		fr.close();

	}

	public static void mergeTwoFilesIntoNewFile() throws IOException {
		File file = new File("./practiceTest");
		if (!file.exists()) {
			file.createNewFile();
		}
		String line = " ";
		String text = " ";
		int asciicode;

		FileReader fr = new FileReader(file);
		while ((asciicode = fr.read()) != -1) {

			line += String.valueOf((char) asciicode);
		}
		System.out.println(line);
		System.out.println("============");

		String path = "./Test.txt";

		FileReader file1 = new FileReader("./Test.txt");
		Scanner scan = new Scanner(file1);

		while (scan.hasNext()) {
			text += (String) scan.nextLine() + "\n";

		}
		System.out.println(text);

		File file2 = new File("./newFile.txt");
		if (!file2.exists()) {
			file2.createNewFile();
		}

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
		bufferedWriter.write(text + line);

		bufferedWriter.flush();
		bufferedWriter.close();
		scan.close();
		fr.close();

	}

	public static void ChangeExistingTextIntouppercase() throws IOException {
		File file = new File("./practiceTest");
		if (!file.exists()) {
			file.createNewFile();
		}
		String line = " ";
		String text = " ";
		int asciicode;

		FileReader fr = new FileReader(file);
		while ((asciicode = fr.read()) != -1) {

			line += String.valueOf((char) asciicode);
		}
		System.out.println(line);
		System.out.println("============");

		String path = "./Test.txt";

		FileReader file1 = new FileReader("./Test.txt");
		Scanner scan = new Scanner(file1);

		while (scan.hasNext()) {
			text += (String) scan.nextLine() + "\n";

		}
		System.out.println(text);

		File file2 = new File("./newFile.txt");
		if (!file2.exists()) {
			file2.createNewFile();
		}

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
		bufferedWriter.write((line).toUpperCase()+"======="+text);

		bufferedWriter.flush();
		bufferedWriter.close();
		scan.close();
		fr.close();
	}

	public static void main(String[] args) throws IOException {
		File file = new File("./practiceTest");
		if (!file.exists()) {
			file.createNewFile();
		}
		String line = " ";
		String text = " ";
		int asciicode;

		FileReader fr = new FileReader(file);
		while ((asciicode = fr.read()) != -1) {

			line += String.valueOf((char) asciicode);
		}
		System.out.println(line);
		System.out.println("============");

		String path = "./Test.txt";

		FileReader file1 = new FileReader("./Test.txt");
		Scanner scan = new Scanner(file1);

		while (scan.hasNext()) {
			text += (String) scan.nextLine() + "\n";

		}
		System.out.println(text);

		File file2 = new File("./newFile.txt");
		if (!file2.exists()) {
			file2.createNewFile();
		}

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
		bufferedWriter.write((line).toUpperCase() +"\n"+ text);

		bufferedWriter.flush();
		bufferedWriter.close();
		scan.close();
		fr.close();
	}

}