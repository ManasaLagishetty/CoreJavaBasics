package com.evoke.programs;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x=6;
      int y=3;       //bitwise operator gives result based on their bit values
      
                       //6=0110 ,3=0011
      
      
      x=x^y;            //x stores 5=0101;
      y=x^y;            //y stores 6=0110;
      x=x^y;            //x stores 3=0011;
      
      System.out.println(x);
      System.out.println(y);
	}

}
