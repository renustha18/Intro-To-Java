package com.objects;

import java.util.Scanner;

public class StudentOperations {
	
	public void addStudents(Student studentArray[], Scanner scr) {  //adding the details
		
		for (int i= 0; i< studentArray.length; i++) {
			
			studentArray[i] = new Student();  //creates an object
			
			System.out.println("Enter student id");
			int sid =scr.nextInt();
			studentArray[i].setStudentId(sid);
			
			System.out.println("Enter student name");
			String sname =scr.next();
			studentArray[i].setStudentName(sname);
			
			System.out.println("Enter student department");
			String dept =scr.next();
			studentArray[i].setStudentDepartment(dept);
				
		}
		
	}
	
	public void display(Student studentArray[] ) { 		//display the student array details
		for (int i = 0; i< studentArray.length; i++) {
			System.out.println(studentArray[i].getStudentName()+ "\t"+studentArray[i].getStudentId()+ "\t"+studentArray[i].getStudentDepartment());
				
		}
		
	}
	
	
	

}
