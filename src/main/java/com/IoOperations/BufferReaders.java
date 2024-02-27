package com.IoOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferReaders {
	public static void main(String[] args) throws IOException {
		File file = new File("./bufferreader.tex");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
//		FileInputStream fis = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(fr);

//		int asciicode = 0;
//		String text = "";
//
//		while ((asciicode=bfr.read()) != -1) {
//			text += String.valueOf((char) asciicode);
//		}
//		System.out.println(text);

		String line = "";
		String text = "";
//
		while ((line = br.readLine()) != null) {
			text += line + "\n";
		}
		System.out.println(text);

		fr.close();
//		fis.close();
//		isr.close();
		br.close();

	}

}
