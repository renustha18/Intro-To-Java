package com.classes;

import java.util.Scanner;

public class PrintStarsInOrder {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		

		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter size for the star format");
		int size = scr.nextInt();
		
		for(int i=1;i<=size;i++) {    //row navivagion    current i = 2, 
			for (int j=1; j<=i; j++) { //column navigation    current j=3
				System.out.print("*");
			}
			System.out.println(); 
		}

	}

}
