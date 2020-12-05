package com.objects;

import java.util.Scanner;

public class StudentObjectsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter the size for student Objects Array");
		int size = scr.nextInt();
		
		Student studentArray[] = new Student[size];  //creates array size not objects initialization
		
		StudentOperations stOperations = new StudentOperations(); 		//when static is removed from studentoperation.java
		stOperations.addStudents(studentArray, scr);
		
//		for (int i= 0; i< studentArray.length; i++) { //current i =1
//			
//			studentArray[i] = new Student();  //creates an object std1
//			
//			System.out.println("Enter student id");
//			int sid =scr.nextInt();
//			studentArray[i].setStudentId(sid);
//			
//			System.out.println("Enter student name");
//			String sname =scr.next();
//			studentArray[i].setStudentName(sname);
//			
//			System.out.println("Enter student department");
//			String dept =scr.next();
//			studentArray[i].setStudentDepartment(dept);
//
//			
//		}
		
		System.out.println("Sname\t Sid \t Depatment");
		System.out.println("---------------------");
		
//		for (int i= 0; i< studentArray.length; i++) {
//			System.out.println(studentArray[i].getStudentId());
//			System.out.println(studentArray[i].getStudentName());
//			System.out.println(studentArray[i].getStudentDepartment());
//			
//		}
		stOperations.display(studentArray);
		
		
		scr.close();

	}

}
