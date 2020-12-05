package com.exception;

public class NotAnEvenNumberException extends Exception {
	public String message;
	
	public NotAnEvenNumberException() {
		this.message = " Num is not an even num";
	}
	
	public NotAnEvenNumberException(String message) {
		this.message = message;
		
	}
	
	@Override
	public String toString() {
		return "NotAnEvenNumberException [message=" + this.message + "]";
	}
		
	
	

}
