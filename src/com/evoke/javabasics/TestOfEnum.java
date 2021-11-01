package com.evoke.javabasics;

public class TestOfEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConceptOfEnum var=ConceptOfEnum.LOW_LEVEL;// we cannot create a object to enum
		System.out.println(var);
		
		 switch(var) {
	      case LOW_LEVEL:
	        System.out.println("it is Low level");
	        break;
	        
	      case MEDIUM_LEVEL:
	         System.out.println("it is Medium level");
	        break;
	        
	      case HIGH_LEVEL:
	        System.out.println("it is High level");
	        break;
	    }

	}

}
