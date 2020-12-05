package com.inheritance;

public class Employee {
	private int EmpID;
	private String name;
	private float salary;
	
	public Employee() {
		
	}
	
	public Employee (int EmpID, String name, float salary) {
		this.EmpID = EmpID;
		this.name= name;
		this.salary= salary;
	}
	

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return EmpID + " " + this.name + " " + this.salary + " ";
	}
	
}
