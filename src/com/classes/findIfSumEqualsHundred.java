package com.classes;

public class findIfSumEqualsHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for (int i=1; i < 11; i++) { //current i =2, 
			sum = sum + i;    //current sum=1
		
		}
		
		if (sum == 100) {
			System.out.println( sum + "is 100");
		}
		if (sum !=100) {
			System.out.println(sum + " is not 100");
		}
	}

}
