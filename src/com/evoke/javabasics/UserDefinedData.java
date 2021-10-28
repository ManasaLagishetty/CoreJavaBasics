package com.evoke.javabasics;

public class UserDefinedData {
	
	private int id;
    private	String name;
    private int salary;
    
	public UserDefinedData(int id, String name, int salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "UserDefinedData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
    
    
	

}
