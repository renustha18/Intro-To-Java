package while_loop;

import java.util.Scanner;

public class ToiletPaperUsingWhileLoop {

	public static void main(String[] args) {
		int numToiletPaperInStore = 300;
		
		Scanner scr = new Scanner(System.in);
		
//		System.out.println("Enter the num of toilet paper");
//		int num = scr.nextInt();
//		
//		numToiletPaperInStore = (numToiletPaperInStore - num);
//		
//		if (numToiletPaperInStore <= 0 ) {
//			System.out.println(" Toilet paper is out of stock");	
//		}
//		else {
//			System.out.println("Enter the num of toilet paper");
//			int num1 = scr.nextInt();
//			numToiletPaperInStore = (numToiletPaperInStore - num1);
//			if (numToiletPaperInStore <= 0 ) {
//				System.out.println(" Toilet paper is out of stock");	
//			}
//			else {
//				System.out.println("Enter the num of toilet paper");
//				int num2 = scr.nextInt();
//				numToiletPaperInStore = (numToiletPaperInStore - num2);
//				if (numToiletPaperInStore <= 0 ) {
//					System.out.println(" Toilet paper is out of stock");	
//				}	
//				
//			}	
//		}
		
		while (numToiletPaperInStore > 0) {
			System.out.println("Enter the num of toilet paper");
			int num1 = scr.nextInt();
			numToiletPaperInStore = (numToiletPaperInStore - num1);	
		}
		System.out.println("Toilet paper is out of stock");
		
		
		
	}

}
