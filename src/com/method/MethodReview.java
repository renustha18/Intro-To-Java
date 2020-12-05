package com.method;

import java.util.Scanner;

public class MethodReview {
	public boolean isEvenorOdd(int a) {
		if (a% 2 == 0) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	public void isPrimeOrNot(int a) {
		for(int i = 2; i< a; i++) {
			if(i== a -1) {
				System.out.println(a +  " is a prime");	
			}
			if(a % i == 0) {
				System.out.println(a + " is not a prime num");
				break;
			}
		}	
	}
	
	public boolean isPrime(int a) {
		boolean aisprime = true;
		for(int i = 2; i < a; i++) { //i 4,a=5
			if(a % i == 0) {
				aisprime = false;			
				break;	
			}
		}
		
		if (aisprime == true) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
//		System.out.println("Checking if Even");
//		
//		System.out.println("Enter number");
//		int num = scr.nextInt();
//		
		MethodReview m = new MethodReview();
//		boolean result = m.isEvenorOdd(num);
//		if(result == true) {
//			System.out.println(num + " is even");
//		
//		}
//		else {
//			System.out.println(num + " is odd");
//		}
//		
//		System.out.println("Checking if Prime");
//		
//		System.out.println("Enter number");
//		int num1 = scr.nextInt();
//		
//		m.isPrimeOrNot(num1);
		
		System.out.println("CheckingIfPrimeWhenItIsReturnType");
		
		System.out.println("Enter number");
		int num2 = scr.nextInt();
		
		boolean result1 = m.isPrime(num2);
		if(result1 == true) {
			System.out.println(num2 + " is prime");	
		}
		
		else {
			System.out.println(num2 + " is not prime");	
			
		}
	
	}

}
