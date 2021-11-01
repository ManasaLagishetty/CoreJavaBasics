package com.evoke.arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,5,3,4,2};
		int temp;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
			if(arr[i]>arr[j]) {
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		for(int values: arr) {
		 System.out.print(values);
		}

	}

}
