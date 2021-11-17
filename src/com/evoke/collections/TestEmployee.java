package com.evoke.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> employee=new ArrayList<>();
		 employee.add(new Employee(2,"Ram",2000));
		 employee.add(new Employee(4,"Rohan",3000));
		 employee.add(new Employee(1,"Sam",8000));
		
		 
		Collections.sort(employee);
		 
		for(Employee obj: employee) {
			
			System.out.println(obj.id+" "+obj.name +" "+obj.salary);
		}

	}

}
