package com.IoOperations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerMethods {
	public static void main(String[] args) throws IOException {

		File file = new File("./Test.txt");
		file.exists();
		file.createNewFile();

		Scanner scanner = new Scanner(file);

		// bcz it returns the string the next methods
//		System.out.println(scanner.next());// it will read only word by word
//		System.out.println(scanner.nextLine());// it will read the line by line

//		To Check the data present in next line
//		System.out.println(scanner.hasNext());// if data present it returns true 
//		Returns true if there is another line in the input of this scanner.
//		System.out.println(scanner.hasNextLine());
		
//		//word by word
//		while (scanner.hasNext()) { //if data present it returns true 
//			System.out.println(scanner.next()); // it will read only word by word
//		}
		
//		while (scanner.hasNext()) {// if data present it returns true 
//			System.out.println(scanner.nextLine()); // it will read the line by line
//		}
		
//		word by word
//		while (scanner.hasNextLine()) {//Returns true if there is another line in the input of this scanner
//			System.out.println(scanner.next());// it will read only word by word
//		}
		
//		while (scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//		}
		
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		
		
		scanner.close();
	}

}
