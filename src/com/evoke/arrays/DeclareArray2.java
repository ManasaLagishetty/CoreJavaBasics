package com.evoke.arrays;

import java.util.Scanner;

public class DeclareArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        int[] arr= new int[5]; 
        
       // int size =sc.nextInt();
       // int[] arr=new int[size];
        
        for(int i=0;i<arr.length;i++) {
          arr[i]=sc.nextInt();
       
        }
        
        for(int element:arr) {
        	System.out.print(element+",");
        }
		
	}

}
