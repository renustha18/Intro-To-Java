package com.inheritance;

public class Person extends Gender{  //Person can access Gender's properties
	public String name;			//String variable property is public
	private String address;		//String variable property is private
	private int phoneNumber;	//int variable property is private
	
	public Person() {		//default constructor
		
	}

	public Person (String name, String address, int phoneNumber, String gender) {	//Parameterized constructor
		super(gender);  	//super accesses parent constructor, super should always be on the top of other statements or code
		this.name= name;
		this.address = address;
		this.phoneNumber= phoneNumber;	
	}
	
	public String getAddress() { //method properties
		return address;
	}
	
	public void setAddress(String address) {  //method properties
		this.address = address;
	}
	
	public int getPhoneNumber() {	//method properties
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {	//method properties
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		String result = super.toString(); //super.toString() gets the return value from parent class's toString() method
		return result + "Student name is " +  this.name + " " + this.address + " " + this.phoneNumber + " ";
	}
}
