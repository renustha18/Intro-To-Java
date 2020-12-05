package com.arrays;

import java.util.Scanner;

public class AddTwoArraysInOneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner  scr = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scr.nextInt();
		
		int a[] = new int [size];
		int b[] = new int [size];
		int c[] = new int [size];
		
		for (int i = 0; i<size; i++) {
			System.out.println(" For A Enter the Number");
			a[i]= scr.nextInt();
		}
		
		for (int i = 0; i<size; i++) {
			System.out.println(" For B Enter the Number");
			b[i]= scr.nextInt();
		}
		
		for ( int i =0; i<size; i++) {
			c[i]=a[i]+b[i];
			
			System.out.println(c[i]);
			
			
		}
		
		scr.close();
	}

}
