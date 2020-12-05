package for_loop;

import java.util.Scanner;

public class ToiletPaper {
	

	public static void main(String[] args) {
		
		
		Scanner scr = new Scanner(System.in);
		
		for ( int NoOfToiletPaper = 300; NoOfToiletPaper > 0; ) {
			System.out.println("Enter the num of toilet paper");
			int num = scr.nextInt();
			NoOfToiletPaper = NoOfToiletPaper-num;	
		}
		System.out.println("Toilet paper is out of stock");
	}
}
