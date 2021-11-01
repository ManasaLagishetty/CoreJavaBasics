package com.evoke.arrays;

public class SmallestInArray {
	
	void small(int[] arr) {
		
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println("smallest number in the array is: "+smallest);
	}

}
