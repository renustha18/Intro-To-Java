package if_condition;

import java.util.Scanner;

public class CheckSumEquals20 {

	public static void main(String[] args) {
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scr.nextInt();
		
		System.out.println("Enter second number");
		int num2 = scr.nextInt();
		
		int sum = num1 + num2;
		if (sum == 20) {
			System.out.println( sum + " is 20");		
		}
		else {	
			System.out.println( sum + " is  not 20");
			
		}
	}

}
