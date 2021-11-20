package com.evoke.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) {
		
	FileInputStream fis;
	FileOutputStream fos;
	
	try {
		fis=new FileInputStream(new File("D:\\CoreJava\\JavaProject\\src\\com\\evoke\\iostreams\\read.txt"));
		fos=new FileOutputStream("D:\\CoreJava\\JavaProject\\src\\com\\evoke\\iostreams\\writeeee.txt");
		int data;
		
		try {
			while((data=fis.read())!=-1) {
				
			fos.write(data);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}

	}

}
