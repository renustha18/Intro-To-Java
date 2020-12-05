package com.arrays;

import java.util.Scanner;

public class DoubleDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter row size");
		int rowSize = scr.nextInt();
		
		System.out.println("Enter column size");
		int colSize = scr.nextInt();
		
		
		String empName[][] = new String [rowSize][colSize];
		
		for (int i= 0; i<rowSize; i++ ) {
			for(int j = 0; j<colSize; j++) {
				System.out.println("Enter empName ");
				empName[i][j] = scr.next();
			}
		}
			
	
		for (int i= 0; i<rowSize; i++ ) {
			for(int j = 0; j<colSize; j++) {
				
				System.out.print(empName[i][j] + "\t");
			}
			System.out.print("\n");
		}
			
		
		
	}

}
