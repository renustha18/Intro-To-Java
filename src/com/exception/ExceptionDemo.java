package com.exception;

import java.util.Scanner;

public class ExceptionDemo {
	
	public void division(Scanner scr) {
		System.out.println("Enter first num ");
		int num1 = scr.nextInt();
		
		System.out.println("Enter second num ");
		int num2 = scr.nextInt();  //0
		
		// Way 1  If condition
//		if (num2==0) {
//			System.out.println("second num cannot be 0");
//		}
//		else {
//			
//			float result = num1/num2;
//			System.out.println("The result is " + result);
//		}
		
	
		
		//Way 2 try catch exception
		try {
			float result = num1/num2;
			System.out.println("The result is " + result);
		}
		catch(ArithmeticException e) {
		
			System.out.println("second num cannot be 0");
		}
		
	}
	
	public void printingIndex(Scanner scr) {
		int  num[] = {1,2,3,4,5};
		
		System.out.println(" Enter the index to print");
		int index = scr.nextInt();
		
		try {
			System.out.println(num[index]);
		}
		
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println(" Array index should not be more than 4");
		}	
		
	}
	
	public void nameLength() {
	
		String name = null;
		
	//	System.out.println("There are " + (name.length()) + " characters");
		
	//	try {
	//		System.out.println("There are " + (name.length()) + " characters");
	//	}	
	//	catch(NullPointerException g) {
	//		System.out.println("Name should not be null");	
	//	}
	
	
		if (name==null) {
			System.out.println("Name should not be null");
		}
		else {
			System.out.println("There are " + (name.length()) + " characters");
		}
	
	}

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scr.nextLine();
		
//		System.out.println(name.replace(name.charAt(2), 'm'));
		
		try {
			System.out.println(name.replace(name.charAt(2), 'm'));
		}
		
		catch(StringIndexOutOfBoundsException i) {
			System.out.println("you should enter name");
			
		}
		finally {
			System.out.println("finally is always executed");
			
			scr.close();
			System.out.println("Scanner closed");
			
		}
		
//		if(name.length()>=3) {
//			System.out.println(name.replace(name.charAt(2), 'm'));
//			
//		}
//		
//		else {
//			System.out.println("you should enter name");
//		}
		
		
		
		
		
	
		
		
		
	
	}	

}
