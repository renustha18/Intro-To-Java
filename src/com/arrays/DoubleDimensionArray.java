package com.arrays;

import java.util.Scanner;

public class DoubleDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter row size");
		int rowSize = scr.nextInt();
		
		System.out.println("Enter column size");
		int colSize = scr.nextInt();
		
			int matrix[][] = new int[rowSize][colSize];
			for (int i = 0; i< rowSize; i++) { //row navigation
				for (int j = 0; j< colSize; j++) { // column navigation
					
					System.out.println ("Enter matrix element");
					matrix[i][j] = scr.nextInt();
					
			
				
				}
			}
			System.out.println ("-----Matrix Elements Are ----");
			for (int i = 0; i< rowSize; i++) { //row navigation
				for (int j = 0; j< colSize; j++) { // column navigation
				
					System.out.print(matrix[i][j] + "\t");
				}
				System.out.println("\n");
			}
			scr.close();
		
				
			}

}
