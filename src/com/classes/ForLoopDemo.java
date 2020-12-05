package com.classes;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = scr.nextInt();
		//for loop otherwise we have to write system.out 10 times
		for(int i=1;i<=num;i++) {  
			System.out.print(i + "    ");
		}
		scr.close();
	}
}