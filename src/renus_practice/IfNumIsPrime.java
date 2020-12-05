package renus_practice;

import java.util.Scanner;

public class IfNumIsPrime {
	
	//condition check if the num is divisible by any number greater than 2
	// for eg- 5%2 no, 5%3 no, 5%4 no

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter the num");
		int num = scr.nextInt();
		
		for (int i = 2; i < num; i ++) {
			if(i == num - 1 ) {
				System.out.println(num + " is a prime");
			}
			if (num % i == 0) {

				System.out.println(num + " is not prime num");
				break;	
			}
		
		}
		

	}
}
