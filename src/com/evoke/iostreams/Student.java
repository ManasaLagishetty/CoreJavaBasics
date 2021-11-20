package com.evoke.iostreams;

import java.io.Serializable;

public class Student  implements Serializable{
	
	int id;
	String name;
	String grade;
	transient int mobile;
	
	Student(int id,String name,String grade,int mobile){
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.mobile=mobile;
		
	}

}
