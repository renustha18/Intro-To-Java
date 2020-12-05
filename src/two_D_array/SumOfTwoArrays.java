package two_D_array;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scr.nextInt();
		
		int number[]= new int [size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the number");
			number[i]= scr.nextInt();
		}
		System.out.println("Now entering num for b");
		
		int numberb[]= new int [size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the number");
			numberb[i]= scr.nextInt();
		}
		int sum = 0;
		for (int i = 0;i < size; i++ ) {
			int sum1 = number[i] + numberb[i];
			sum = sum + sum1;	
		}
		System.out.println(sum);

	}

}
