package com.arrays;

import java.util.Scanner;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  scr = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scr.nextInt();
		
		long contactNumbers[]= new long [size];  //contactNumber =[222345,
												//				   23344]
		
		//multiple values of same times so for loop
		for(int i = 0; i<contactNumbers.length;i++){    //contactNumbers.length= size , can be used when size (variables) is hidden.
			
			System.out.println("Enter contact number");
			contactNumbers[i] = scr.nextLong();  //reading the input
			
		}
		
		System.out.println("=======contact numbers list is ========");
		
		
		
		for(int i=0; i<size; i++) {  //current i= 3
			System.out.println(contactNumbers[i]);
			
			
		}
		
		scr.close();
		
	}

}
