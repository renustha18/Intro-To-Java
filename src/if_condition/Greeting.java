package if_condition;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter time");
		int time = scr.nextInt();
		
		if (time < 10) {
			System.out.println("Good morning");
		}
		
		if (time > 9 && time < 17 ) {
			System.out.println("Good afternoon");
		}
		
		if (time > 16 && time < 25 ) {
			System.out.println("Good night");
		}
		
	}

}
