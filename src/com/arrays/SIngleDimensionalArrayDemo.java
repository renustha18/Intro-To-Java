package com.arrays;

import java.util.Scanner;

public class SIngleDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scr = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scr.nextInt();
		
		String empName[]= new String [size];  //[0,
								  // 0]

		for (int i= 0; i< size; i++) {    //current
			System.out.println("Enter the Name");
			empName[i] = scr.next();
			}
		System.out.println(" Now we are printing names ");
		for (int i= 0; i< size; i++) {
			System.out.println(empName[i]);
			
		}	
		scr.close();
	}

}
