package com.evoke.oops;

public class EncapsulationEx {

	private String firstName;
	private String lastName;
    private int accountNum;
    
    public String getFirstName() {
    	return firstName;
    }
    public void setFirstName(String firstName) {
    	
    if(firstName!="Manasa") {
     System.out.println("firstname changed");
     
    }
    	
    	this.firstName=firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    public void setLastName(String lastName) {
    	this.lastName=lastName;
    }
    public int getAccountNum() {
    	return accountNum;
    }
    public void setAccountNum(int accountNum) {
    	
    	if(accountNum==0) {
    		System.out.println("give a proper Account number");
    	}
    	
    	this.accountNum=accountNum;
    }
	}


