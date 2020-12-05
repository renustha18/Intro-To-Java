package for_loop;

import java.util.Scanner;

public class PrintNumberDivisibleBy3from1ToGivenNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the number");
		int num = scr.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		

	}

}
