package com.classes;

import java.util.Scanner;

public class FindTheBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 Check the biggest number among 3 numbers, 

		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scr.nextInt();
		System.out.println("Enter second number");
		int num2 = scr.nextInt();
		System.out.println("Enter third number");
		int num3 = scr.nextInt();
		
		if (num1> num2 && num1> num3) {
			System.out.print(num1 + " is the biggest");
		}
		if (num2> num1 && num2 > num3) {
			System.out.print(num2 + " is  the biggest");	
		}
		if (num3> num1 && num3 > num2) {
			System.out.print(num3 + " is  the biggest");	
		}
		if (num1 == num2 && num1 == num3) {
			System.out.print("all three numbers are equal");
		}
		
		if (num1 == num2 && num1 != num3) {
			System.out.print(" num1 and num2 are equal");
		}
		if (num1 == num3 && num1 != num2) {
			System.out.print(" num1 and num3 are equal");
		}
		if (num2 == num3 && num2 != num1) {
			System.out.print(" num2 and num3 are equal");
		}
			
		scr.close();
	}

}
