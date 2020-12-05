package renus_practice;

import java.util.Scanner;

public class FamilyName2 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arraysize = scr.nextInt();
		
		String[] name = new String[arraysize];
		int[] age = new int[arraysize]; //{2, 4}
		
		
		
//		for (int i = 0; i <=(arraysize - 1)/ 2; i++) {
//			System.out.println("Enter the name");
//			name[i*2] =  scr.next();
//		}
		
		for (int i = 0; i < arraysize; i++) {
			System.out.println("Enter name");
			name[i] =  scr.next();	
		}
		

		for (int i = 0; i < arraysize; i++) {
			System.out.println("Enter age");
			age[i] =  scr.nextInt();	
		}
		
		
		for ( int i = 0; i< arraysize; i++) {
			System.out.println(name[i]);
			System.out.println(age[i]);
			
		}
		

	}

}
