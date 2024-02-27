package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

import com.beust.jcommander.Strings;

public class PropertiesPractice {
	public static void main(String[] args) throws Exception {
		File file = new File("dbConfig.properties");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file created successfully");
		}

//	 write the data into dbconfig properties
//	FileOutputStream fos = new FileOutputStream(file);
		Properties prop = new Properties();
//	prop.setProperty("url", "www.https://google.com");
//	prop.setProperty("username", "kirankumar");
//	prop.setProperty("password", "kiran@123");
//	
//	prop.store(fos, "");
//		to load the properties fro properties file
		FileInputStream fis= new FileInputStream(file);
		prop.load(fis);

		Set<String> keys = prop.stringPropertyNames();
		System.out.println(keys);
		
		Collection<Object>values=prop.values();
		System.out.println(values);
		
		for(Object key:prop.keySet()) {
			System.out.println(key+">>>"+prop.getProperty((String) key));
		}

	}
}
