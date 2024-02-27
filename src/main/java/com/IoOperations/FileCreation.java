package com.IoOperations;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileCreation {
	static File file;

	public void createNewFile(String path) throws IOException {
		file = new File(path);
		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}

	}

	public File fileWriteAccess(String path) {
		file = new File(path);
		if (!file.canWrite()) {
			file.setWritable(true);
		}
		return file;
	}

	public File fileReadAccess(String path) {
		file = new File(path);
		if (!file.canRead()) {
			file.setReadable(true);
		}
		return file;

	}

	public static File getFileFromDriver(String path) {
		file = new File(path);
		if (Arrays.toString(file.list()) != null) {
//			get the files from the driver
			System.out.println(Arrays.toString(file.list()));
		} else {
			System.out.println("pass the currect path");
		}
		return file;

	}

	public static void getFilesIncludingPath(String path) {
		file = new File(path);
		if (Arrays.toString(file.listFiles()) != null) {
			Arrays.toString(file.listFiles());
		} else {
			System.out.println("pass the currect path");
		}

	}
	
	public File CreateFolder(String path) {
		file = new File(path);
		if(!file.mkdir()){
			file.mkdir();
		}
		return file;
	}
	
	public File createFolderInsideFolder(String path) {
		file= new File(path);
		if(!file.mkdirs()) {
			file.mkdirs();
		}
		return file;
	}

	public static void main(String[] args) throws IOException {
		File file = new File("./Resource/test");// it will generate the files in your current project
//		file.delete();
//	file.createNewFile();

//		if (file.exists())
//			file.delete();
//		System.out.println(file.mkdirs());
//		if(file.canWrite())
//		file.setWritable(true);

	}
}
