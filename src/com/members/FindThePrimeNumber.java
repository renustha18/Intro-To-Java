package com.members;

import java.util.Scanner;

public class FindThePrimeNumber {


	public void findIfPrimeOrNot(int num){
		
		boolean numberIsPrime = true;

		for	(int i= 2; i< num; i++ ) {   // current i = 4, num= 8
			if (num % i == 0) {
				numberIsPrime = false;
				System.out.print(num + " is a not a prime number");
				break;   //to stop the result once it is true
			}		
		}
		if (numberIsPrime == true ){
			System.out.print(num + " is a prime number");
		}
		
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = scr.nextInt();
		
		FindThePrimeNumber a= new FindThePrimeNumber();
		a.findIfPrimeOrNot(num);
		
		
		//currentt num = 5
		// 5%2 *, 5%3 *, 5%4 * == prime
		// 8/2 +, != prime
		// 11/2 *, 11/3 *, 11/4 *, .....11/10 * == prime
		

	}

}
