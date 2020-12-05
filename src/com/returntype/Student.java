package com.returntype;

public class Student {
	public String name;
	public int age;
	public int months; 
	
	public Student() {
		
	}
	
	
	//public returntype methodName(parameters)
	public String getStudentInfo() {
		return "stundentName is " + name + " age is " + age;
	}
	
	//public returntype methodName(parameters)
	public void printStudentInfo() {
		System.out.println("studentName is " + name + " age is " + age);
	}
	
	public int calculateMonths() {
		months = age*12;
		 
		return months;	
	}
	
	public void calculateDays() {
		int days = age*365;
		
		System.out.println(days);
		
	}
}
