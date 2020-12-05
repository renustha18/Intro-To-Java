package if_condition;

import java.util.Scanner;

public class CheckIfIsocelesTriangle {
	//multiple if or condition

	public static void main(String[] args) {
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter  length");
		int length = scr.nextInt();

		System.out.println("Enter  breadth");
		int breadth = scr.nextInt();
		
		System.out.println("Enter height ");
		int height = scr.nextInt();
		
		if(length == breadth || length == height || breadth == height) {
			System.out.println("Triangle is isoceles triangle");
		}
		else {
			System.out.println("Triangle is not isoceles triangle");
		}

		
	}

}
