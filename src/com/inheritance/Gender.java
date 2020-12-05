package com.inheritance;
 

public class Gender {
	private String gender; // private string variable properties
	private double height;

	public Gender() {  //default constructor
		
	}
	
	public Gender(String gender) { //parameterized constructor
		this.gender = gender;
	}
	
	public String getGender() {  //method properties
		return gender;
	}

	public void setGender(String gender) {  //method properties
		this.gender = gender;
		
	}
	 public String toString() {   //method properties
		 return this.gender + " " + this.height;
	 }
	

}
