package com.exception;

import java.util.Scanner;

public class LessThanFiveExceptionThrow {
	public void checkLessThanFive(Scanner scr) throws LessThanFiveException{
		System.out.println("Enter num ");
		int num = scr.nextInt();
		
		if (num<5) {
			throw new LessThanFiveException();
		}
		else {
			System.out.println("Your number is good");
		}
		
		
		
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		LessThanFiveExceptionThrow number = new LessThanFiveExceptionThrow();
	
		try {
			number.checkLessThanFive(scr);
		}
		
		catch(LessThanFiveException e) {
			System.out.print(e.toString());
		}
				
	}

}
