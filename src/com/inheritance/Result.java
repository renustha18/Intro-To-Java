package com.inheritance;

public class Result {  

	public static void main(String[] args) { 
		
		System.out.println("Teacher 1");
		Teacher tech1 = new Teacher();
		tech1.setDepartment("Health");
		tech1.setSubject("food science");
		tech1.setEmpID(1);
		tech1.setName("Renu");
		tech1.setSalary(1000);
		
		System.out.println(tech1.toString());
		
		Teacher tech2 = new Teacher("CS", "computer", 3, "Sujan", 2000);
		System.out.println(tech2.toString());
		
		
		Staff stf1 = new Staff("Catering", 101, "Sujan",  10000);
		System.out.println(stf1.toString());
	

	}
	


}
