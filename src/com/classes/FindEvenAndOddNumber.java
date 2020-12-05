package com.classes;

import java.util.Scanner;

public class FindEvenAndOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i<=20; i++ ) {  
			
			if (i % 2 == 0 ) {
				
				System.out.print(i + " is even number \n"); //current i = 1
				
			}
			if (i % 2 != 0) {
				System.out.print(i + " is odd number \n");
			}
	
		}
		
		
	}

}
