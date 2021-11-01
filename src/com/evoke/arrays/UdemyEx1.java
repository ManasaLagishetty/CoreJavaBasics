package com.evoke.arrays;

public class UdemyEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[] arr= {1,2,1,2,1,3};  //Expected:{1,0,1,0,1,3} 
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1&&arr[i+1]==2) {
				arr[i+1]=0;
			}
		}
		
		for(int element:arr) {
			System.out.print(element);
		}
		
	}

}
