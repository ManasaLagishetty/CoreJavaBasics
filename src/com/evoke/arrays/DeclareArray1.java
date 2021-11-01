package com.evoke.arrays;

public class DeclareArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		
		arr[0]=20; 
		arr[1]=new Integer(40);
		arr[2]=new Integer(60);
		arr[3]=new Integer(80);
		arr[4]=new Integer(100);
		
		
		for(int value: arr) {
		System.out.print(value+",");
		}
		
		

	}

}
