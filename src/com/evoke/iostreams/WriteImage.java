package com.evoke.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FileInputStream fileinput=null;
		FileOutputStream  fileoutput =null;
		
		try {
			fileinput = new FileInputStream("C:\\Users\\mlagishetty\\Desktop\\image\\leaf.jpg");
		    fileoutput = new FileOutputStream("C:\\Users\\mlagishetty\\Desktop\\leaves.jpg");
			int data;
			
			try {
				while((data=fileinput.read())!=-1) {
					
					fileoutput.write(data);
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
