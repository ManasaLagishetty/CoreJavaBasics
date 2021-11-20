package com.evoke.iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		FileWriter fw=null;
		
		fr=new FileReader("D:\\CoreJava\\JavaProject\\src\\com\\evoke\\iostreams\\read.txt");
		fw=new FileWriter("D:\\CoreJava\\JavaProject\\src\\com\\evoke\\iostreams\\writeinfile.txt");
		
		int data;
		while((data=fr.read()) != -1) {
			fw.write(data);
		}
		
		fr.close();
		fw.close();

	}

}
