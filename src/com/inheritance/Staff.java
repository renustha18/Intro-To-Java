package com.inheritance;

public class Staff extends Employee{
	private String jobType;
	
	public Staff() {
		
	}
	
	public Staff(String jobType, int EmpID, String name, float salary) {
		super(EmpID, name, salary);
		this.jobType= jobType;
		
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	
	public String toString() {
		String result = super.toString();
		return result + this.jobType;
	}
	
}




