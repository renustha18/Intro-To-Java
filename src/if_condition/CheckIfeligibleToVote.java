package if_condition;

import java.util.Scanner;

public class CheckIfeligibleToVote {

	public static void main(String[] args) {
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter months");
		int months = scr.nextInt();
		
		int age = months/12;
		
		if (age <18) {
			System.out.println("You are not eligible to vote");
		}
		
		else {
			System.out.println("You are eligible to vote");
			
		}
		

	}

}
