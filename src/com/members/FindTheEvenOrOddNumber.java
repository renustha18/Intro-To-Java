package com.members;

import java.util.Scanner;

public class FindTheEvenOrOddNumber {
	
	//void does not return anything
	public void ifEvenOrOdd(int num) {
		
		if(num%2 ==0) {
			System.out.println(num + " is even");
		}
		else {
			System.out.println(num + " is odd");
		}
		
	}
	
	public void checkIfDivisibleByThree(int num) {
		if (num % 3 == 0) {
			System.out.println(num + "is divisible by 3");
		}
		else {
			System.out.println(num + " is not divisible by 3");
		}
	}
	
	//this method return string value
	public String  checkIfDivisibleByThreeNew(int num) {
		if (num % 3 == 0) {
			return num +" is divisible by 3";
		}
		else {
			return num +" is not divisible by 3";
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = scr.nextInt();
		
		FindTheEvenOrOddNumber a = new FindTheEvenOrOddNumber();
		a.ifEvenOrOdd(num);
		a.checkIfDivisibleByThree(num);
		String c = a.checkIfDivisibleByThreeNew(num); //currently  c= "yes"
		System.out.println(c);
		
	}

}
