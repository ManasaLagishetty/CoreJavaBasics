package com.evoke.arrays;

public class ArrayDuplicates {
	
	 public void duplicates(int[] arr) {
		
      for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=-1) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=-1;
					
				}
			}
			System.out.println("for "+arr[i]+" the number of duplicates => "+count);
		}
		}
		
	}

}
