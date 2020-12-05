package com.arrays;

import java.util.Scanner;

public class TwoDimensionalArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter row size");
		int rowSize = scr.nextInt();
		
		System.out.println("Enter column size");
		int colSize = scr.nextInt();
		
		
		int a[][] = new int[rowSize][colSize];
		
		int b[][]= new int[rowSize][colSize];
		
		int c[][]= new int[rowSize][colSize];
		
		
		for (int i= 0; i<rowSize;i++ ) {
			for (int j=0; j< colSize;j++) {
				System.out.println("Enter number for a");
				a[i][j] = scr.nextInt();
			}
		}
		
		for (int i= 0; i<rowSize;i++ ) {
			for (int j=0; j< colSize;j++) {
				System.out.println("Enter number for b");
				b[i][j] = scr.nextInt();
			}
		}
		for (int i=0; i< rowSize;i++) {
			for (int j= 0; j<colSize; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		
				
		

	}

}
