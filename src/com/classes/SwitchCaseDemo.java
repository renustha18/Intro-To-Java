package com.classes;

import java.util.Scanner;

/**
 * Homework 5
 * @author renushrestha
 *
 */
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter number");
		
		int num = scr.nextInt();

		switch (num) {
			case 1: 
				System.out.println("one");  //can be used for days
				break;
		
			case 2: 
				System.out.println("two");
				break;
			case 3: 
				System.out.println("three");
				break;
		
			case 4: 
				System.out.println("four");
				break;
			case 5: 
				System.out.println("five");
				break;
		
			case 6: 
				System.out.println("six");
				break;
			case 7: 
				System.out.println("seven");
				break;
			
		}		
	}

}
