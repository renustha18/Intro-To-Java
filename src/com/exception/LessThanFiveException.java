package com.exception;

public class LessThanFiveException extends Exception {
	
	public String message;
	public LessThanFiveException() {
		message = "You entered number less than 5";
		
	}
	@Override
	public String toString() {
		return "LessThanFiveException [message=" + message + "]";
	}

	
}
