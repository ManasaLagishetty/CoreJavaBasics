package com.evoke.oops;

interface EmployeeInterface {

	void projet();

}

interface StudentInterface {
	void studentDetails();
}

class ShowDetails implements EmployeeInterface, StudentInterface {

	@Override
	public void studentDetails() {
		System.out.println("name: Manasa ,Id;2347");

	}

	@Override
	public void projet() {
		System.out.println("java project");
	}

}