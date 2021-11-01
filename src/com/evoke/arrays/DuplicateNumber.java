package com.evoke.arrays;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] arr= {1,2,3,4,5,1,2,3};
	
	for(int i=0;i<arr.length;i++) {
		//int count=0;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				
				System.out.println("duplicate is: "+arr[j] );
			}
		}
	}

	}

}
