package com.exception;

import java.util.Scanner;

public class ExceptionThrowDemo {
	public String checkIfEvenNum(int num) throws NotAnEvenNumberException {
		if(num %2 != 0) {
//			throw new NotAnEvenNumberException(" you entered odd number");
			NotAnEvenNumberException ex = new NotAnEvenNumberException();
			throw ex; 
		}
		
		else {
			return "even";
			
		}
			
	}

	public static void main(String[] args) {
		int num = 5;
		
		ExceptionThrowDemo number = new ExceptionThrowDemo();
	
	
		try {
			String result = number.checkIfEvenNum(num); // "even"
		}
		
		catch(NotAnEvenNumberException e) {
			System.out.println(e.toString());
		}
		
		
			
		

	}

}
