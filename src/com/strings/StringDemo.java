package com.strings;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scr = new Scanner(System.in);
//		
//		System.out.println("Enter first name");
//		String firstName = scr.next();
//		
//		System.out.println("Enter last name");
//		String lastName = scr.next();
//		//concat example
//		System.out.println("Hi my name is ".concat(firstName).concat(" ").concat(lastName));
	
		//char[] = String
		String name = "Renu";
		char[] nameChars = { 'R','e','n','u'};

		String message = " hi this is renu hi this";
		System.out.println(name.substring(2));
		System.out.println(name.substring(1,2)); //beginindex, ending index , end-begin gives # of characters to be printed
		
		System.out.println(message.lastIndexOf("this"));
		System.out.println(name.replace('n','m'));
		System.out.println(name.toUpperCase());
		
//		System.out.println(name.charAt(3));
		
//		System.out.println(name.startsWith("Re"));  
		
//		System.out.println(name);
//		System.out.println(nameChars); 
//		
//		
		//(.length) gives the number of size or characters in the array[]
		System.out.println(" There are ".concat(String.valueOf(name.length())).concat(" characters "));
		
		
//		System.out.printf("My name is %s", name);     //%s is placeholder for string(name)
//		
//		System.out.printf("\nThere are %d characters", name.length());   //%d is placeholder for integers.
	}

}
