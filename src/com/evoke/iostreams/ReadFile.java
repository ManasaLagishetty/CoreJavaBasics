package com.evoke.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream readFile = null;
		try {
			readFile = new FileInputStream(new File("D:\\CoreJava\\JavaProject\\src\\com\\evoke\\iostreams\\read.txt"));
			System.out.println("file opened");

			int i;
			while ((i = readFile.read()) != -1) {
				System.out.print((char) i);
			}

			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				readFile.close();

				System.out.println("File Closed");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
