package com.evoke.collections;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int compareTo(Employee obj) {
		if (this.id == obj.id)
			return 0;

		else if (this.id > obj.id)
			return 1;

		else
			return -1;

	}
}
