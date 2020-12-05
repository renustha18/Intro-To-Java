package if_condition;

import java.util.Scanner;

public class CheckNumDivisibleBy3 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = scr.nextInt();

		if (num % 3 == 0) {
			System.out.println(num + "is divisble by 3");
		}
		else {
			System.out.println(num + "is not divisble by 3");
		}
	}

}
