package exception;

import java.util.Scanner;

public class ArithmaticExceptionHandling {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter first num ");
		int num1 = scr.nextInt();
		
		System.out.println("Enter second num ");
		int num2 = scr.nextInt();
		
		try {
			int result = num1 / num2;
			System.out.println(" The result is " + result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Sorry you cannot divide by 0");
			
		}
	
	}

}
