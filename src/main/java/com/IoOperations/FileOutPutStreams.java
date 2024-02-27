package com.IoOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutPutStreams {
	public static void main(String[] args) throws IOException {
		File file = new File("./outputStream.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		String str = "hello world java";
		// when we are using file output stream we want to do flush
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
// we are sending the asciicode into to the files
//		fileOutputStream.write(74);
//		fileOutputStream.write(74);
//		fileOutputStream.write(77);
//		fileOutputStream.write(78);
//			fileOutputStream.write(98);
//
////		for (int i = 0; i < str.length(); i++) {
////			fileOutputStream.write((int) str.charAt(i));
////		}
//
////					(or)
//		for (char ch : str.toCharArray()) {
//			fileOutputStream.write((int) ch);
//		}
//
//		// but if we don't do flush then close method do the internally flush
//		fileOutputStream.flush();
//
//		fileOutputStream.close();
		
		
		FileWriter fw = new FileWriter(file);
//		fw.write(str);
//		fw.write(str.toCharArray());
		
		for (int i = 0; i < str.length(); i++) {
			fw.write(str.charAt(i));
		}
		
		
		fw.flush();
		fw.close();

	}

}
