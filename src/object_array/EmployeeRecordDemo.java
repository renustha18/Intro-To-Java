package object_array;

import java.util.Scanner;

public class EmployeeRecordDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size = scr.nextInt();
		
		EmployeeRecord[] emp = new EmployeeRecord[size];
		
		for(int i = 0; i< size; i++) {
			emp[i] = new EmployeeRecord();
			System.out.println("Enter empID");
			int empID= scr.nextInt();
			System.out.println("Enter empsalary");
			int empSalary = scr.nextInt();
			
			emp[i].setEmployeeId(empID);
			emp[i].setSalary(empSalary);	
		}
		for(int i= 0; i< size; i++) {
			int eID = emp[i].getEmployeeId();
			int eSalary = emp[i].getSalary();
			
			if (eSalary >= 50000) {
				System.out.println();
				System.out.println("Employee ID is " + eID + " and salary is " + eSalary);
				
			}
			
		}
		
		
		

	}

}
