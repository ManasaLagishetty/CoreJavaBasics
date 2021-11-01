package com.evoke.arrays;

public class TestOfDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,1,2,1,2};
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
	
		for(int i=0 ;i<arr.length;i++) {                                    //1 1 1 2 2 2 3
	         System.out.println("new index value: "+i);  
	                                                             //   index   0 1 2 3 4 5 6 
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 
					count++;
					
				}
			
			i=i+count;
				
			
		System.out.println("for "+arr[i]+" the duplicates "+count);
		 
		
		
		}
	}

}
