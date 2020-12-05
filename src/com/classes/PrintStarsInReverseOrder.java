package com.classes;

import java.util.Scanner;

public class PrintStarsInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter size for the star format");
		int size = scr.nextInt();
		
		for(int i=1;i<=size;i++) {   //row navigation
			for (int j= size; j>=i; j--) { // column navigation
				System.out.print("*");
			}
			System.out.println(); 
		}

	}

}
