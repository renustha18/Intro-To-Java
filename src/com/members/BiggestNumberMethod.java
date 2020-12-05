package com.members;

import java.util.Scanner;

public class BiggestNumberMethod {
	
	
	private String findBiggestNumber(int a, int b, int c) {
		
		if(a==b && b==c) {
			return "All are equal";
		}
		if(a>b && a>c) {
			return a+" is biggest";
			
		}
		else if (b>a && b>c) {
			return b + " is biggest";
			
		}
		
		else {
			return c + " is biggest";
		}
	}

	public static void main(String[] args) {
		BiggestNumberMethod obj  = new BiggestNumberMethod();
		
		Scanner  scr = new Scanner(System.in);
		
		
		System.out.println("Enter first value");
		int first = scr.nextInt();
		

		System.out.println("Enter second value");
		int second = scr.nextInt();
		System.out.println("Enter third value");
		int third = scr.nextInt();
		
		String result = obj.findBiggestNumber(first, second, third);
		System.out.println(result);

		
		
		
		System.out.print("Enter first value");
		 first = scr.nextInt();
		System.out.print("Enter second value");
		 second = scr.nextInt();
		System.out.print("Enter third value");
		 third = scr.nextInt();
		 
		 result = obj.findBiggestNumber(first, second, third);
		 System.out.println(result);
		
		
		
		
		
		scr.close();
		
		

	}

}
