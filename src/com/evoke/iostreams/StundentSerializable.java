package com.evoke.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class StundentSerializable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fis = null;
		ObjectOutputStream oos = null;

		try {
			fis = new FileOutputStream("C:\\Users\\mlagishetty\\Desktop\\student.ser");

			oos = new ObjectOutputStream(fis);
			Student std = new Student(1, "john", "A", 123456);

			oos.writeObject(std);
			System.out.println("student object serialized");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
