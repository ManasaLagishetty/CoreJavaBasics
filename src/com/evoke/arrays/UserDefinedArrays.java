package com.evoke.arrays;

public class UserDefinedArrays {

	public void newArray() {
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	void stringNames(String... names) {
		System.out.println();
		for(String name: names) {
			
			System.out.print(name+",");
		}
		System.out.println();
	}
	
	void highestSalary(int[] salary) {
		int highest=salary[0];
		int i;
		for( i=1;i<salary.length-1;i++) {
			if(highest<salary[i]) {
				highest=salary[i];
			}
		}
		System.out.println("highest salary is: "+salary[i]);
		
	}
	
	
		
	}
			
			
			
