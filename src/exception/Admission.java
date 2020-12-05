package exception;

import java.util.Scanner;

public class Admission {

	public static void main(String[] args) {
		Scanner scr = new Scanner (System.in);
		
		System.out.println("What is your percentage");
		double percentage = scr.nextDouble();
		
		
		CheckPercentage chk = new CheckPercentage();
		
		
		try {
			boolean result = chk.checkPercentage(percentage);
			if (result == true) {
				System.out.println("Congratulations on your admission");
			}
		}
		catch (NotEnoughPercentageException a) {
			System.out.print(a.message);
			
		}
		
	}

}
