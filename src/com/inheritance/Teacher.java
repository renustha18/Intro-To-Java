package com.inheritance;

public class Teacher extends Employee{  //Teacher is a type of employee- Employee is the parent of Teacher
	private String department;
	private String subject;
	
	
	public Teacher() {
		
	}

	public Teacher(String department, String subject, int EmpID, String name, float salary) {
		super(EmpID, name, salary);
		this.department= department;
		this.subject= subject;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		String result = super.toString();
		return result + " " + this.department+ " "+ this.subject;
		
	}
	
	
	
}
