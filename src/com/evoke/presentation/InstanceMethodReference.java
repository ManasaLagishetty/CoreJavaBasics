package com.evoke.presentation;



interface Employee{
	void salary(int i);
}
class EmployeeClass{
	
	void MonthlySalary(int i) {
		System.out.println("Employee month Salary is:" +i);
	}
}

public class InstanceMethodReference {

	public static void main(String[] args) {
		
		Employee obj =  i -> System.out.println("month salary is: "+i);
		obj.salary(20000);
		
	EmployeeClass obj2 = new EmployeeClass();
		
		Employee emp=obj2::MonthlySalary;
		
		emp.salary(30000);
	}

}
