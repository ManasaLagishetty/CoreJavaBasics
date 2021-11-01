package com.evoke.arrays;

public class TestOfUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedArrays obj=new UserDefinedArrays();
		
		obj.newArray();
		obj.stringNames("Manasa","Sravani","Deepthi");
		
        int[] salary= {20000,300000,400000,500000};
        
        obj.highestSalary(salary);
        
    
	}

}
