package for_loop;

import java.util.Scanner;

public class BuyProductFromStore {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int costOfBooks = 400;
		int costOfLaptop = 500;
		int costOfNotebook = 100; 
		
		

		for(int MoneyInPocket = 1000; MoneyInPocket > 0;) {
			System.out.println("What do you want to buy?");
			String product = scr.next();
			if (product.equals ("books")) {
				MoneyInPocket = MoneyInPocket - costOfBooks;		
			}
			if (product.equals ("Laptop")) {
				MoneyInPocket = MoneyInPocket - costOfLaptop;
			
			}
			if (product.equals ("Notebook")) {
				MoneyInPocket = MoneyInPocket - costOfNotebook;
			}	
		}
		System.out.println("You are out of money");
	}

}
