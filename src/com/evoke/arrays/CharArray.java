package com.evoke.arrays;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'E','V','O','K','E'};
		
		if(arr[0]==arr[arr.length-1]) {
			System.out.print("First and last chars of array are same");
			
		}
		else {
			System.out.println("characters are not same");
		}

	}

}
