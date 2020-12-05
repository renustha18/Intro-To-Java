package com.classes;

import java.util.Scanner;

public class ScannerInputReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = scr.nextInt();
		
		String result = number%2 == 0?"Even" : "Odd";
		System.out.println(number+" is "+result);
		
		
		/*System.out.println("Enter name");
		String name = scr.next();  //read string
		System.out.println("Enter decimal value");
		float decimal = scr.nextFloat();
		
		
		
		System.out.println("Number ="+number);
		System.out.println("Name ="+name);
		System.out.println("Decimal ="+decimal);*/
		
		scr.close();

	}

}
 