package if_condition;

import java.util.Scanner;

public class IfNumGreaterThanFive {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = scr.nextInt();
		
		if (num > 5) {
			System.out.println(num + "is greater than 5");
			
		}
		else {
			System.out.println(num + "is less than 5");
		}
	}

}
