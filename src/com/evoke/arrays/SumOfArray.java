package com.evoke.arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      float[] arr=new float[5];
      float sum=0.0f;
      
      System.out.println("Enter values of Array");
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=sc.nextFloat();
    	  
      }
      
      for(float element:arr) {
    	  sum=sum+element;
      }
      System.out.println(sum);

	}

}
