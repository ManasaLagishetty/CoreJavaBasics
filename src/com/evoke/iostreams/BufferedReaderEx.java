package com.evoke.iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderEx {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		int count = 0;

		try {
			fr = new FileReader("D:\\CoreJava\\JavaProject\\src\\com\\evoke\\iostreams\\BufferedReader.txt");
			br = new BufferedReader(fr);

			String line;

			try {
				while ((line = br.readLine()) != null) {

					StringTokenizer st = new StringTokenizer(line);
					while (st.hasMoreTokens()) {
						System.out.println(st.nextToken());
						count++;
					}

				}

				System.out.println("the number of words int the file: " + count);
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
