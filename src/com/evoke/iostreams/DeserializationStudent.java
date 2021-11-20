package com.evoke.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationStudent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
             FileInputStream fis=new FileInputStream("C:\\Users\\mlagishetty\\Desktop\\student.ser");
             ObjectInputStream ois=new ObjectInputStream(fis);
             
             Object obj=ois.readObject();
             
            Student std=(Student) obj;
            
            System.out.println("student id: "+std.id);
            System.out.println("student name: "+std.name);
            System.out.println("student grade: "+std.grade);
            System.out.println("student mobile: "+std.mobile);
            
	}

}
