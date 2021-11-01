package com.evoke.arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2},{1,2},};
		
		int[][] arr1= {{1,2},{1,2}};
		
		int sum[][]= new int[2][2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				
				sum[i][j]= arr[i][j]+arr1[i][j];
			
			System.out.print(sum[i][j]);
			}
		
		System.out.println();
		}
	}

}
