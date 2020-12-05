package one_D_array;

import java.util.Scanner;

public class SquareOfNumbers {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scr.nextInt();
		
		int[] Numbers= new int [size];

		for(int i=0; i < size; i++) {
			System.out.println("Enter number");
			 Numbers[i] = scr.nextInt();
			
		}
		for (int i= 0; i<size; i++) {
			Numbers[i]= Numbers[i] * Numbers[i];
			System.out.println(Numbers[i]);
		}
		for (int i= 0; i<size; i++) {

			 sum = sum + Numbers[i];	
		}
		System.out.println(sum);
			
	}

}
