package com.evoke.javabasics;

public class ConceptOfThis {
	int id;
	int study;
	String name;
	ConceptOfThis (int id,int study,String name){
		this.id=id;
		this.study=study;
		this.name=name;
	}
	
	void show() {
		System.out.println("Name: "+name);
		System.out.println("id: "+id);
		System.out.println("study: "+study);
		
	}

}
