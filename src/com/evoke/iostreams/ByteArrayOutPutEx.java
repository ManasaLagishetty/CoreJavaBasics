package com.evoke.iostreams;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutPutEx {

	public static void main(String[] args) throws IOException {
		  FileOutputStream fout1=new FileOutputStream("C:\\Users\\mlagishetty\\Desktop\\file.txt");    
	      FileOutputStream fout2=new FileOutputStream("C:\\Users\\mlagishetty\\Desktop\\file2.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(98);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	     
	      bout.close();//has no effect    
	      System.out.println("writing completed");    

	}

}
