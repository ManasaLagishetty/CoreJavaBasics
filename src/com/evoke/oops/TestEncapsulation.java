package com.evoke.oops;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationEx obj = new EncapsulationEx();
		obj.setFirstName("Niha");
		obj.setLastName("Lagishetty");
		obj.setAccountNum(0);
		

		System.out.println("First Name: " + obj.getFirstName());
		System.out.println("last Name: " + obj.getLastName());
		System.out.println("Account number: " + obj.getAccountNum());

	}

}
