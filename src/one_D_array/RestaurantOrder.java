package one_D_array;

import java.util.Scanner;

public class RestaurantOrder {

	public static void main(String[] args) {
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the order size");
		int size = scr.nextInt();
		
		String food[]= new String [size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter food ");
			food[i]= scr.next();
				
		}
		int total = 0;
		
		for (int i = 0; i < size; i++) {
			int costOfBiryani = 11;
			int costOfChicken = 11;
			int costOfMutton = 15;
			int costOfShrimp = 20;
			int costOfLamb = 15;
			int cost = 0; 
			if (food[i].equals("biryani" )) {
				 cost = costOfBiryani;
			}
			if (food[i].equals("chicken" )) {
				 cost = costOfChicken;
			}
			if (food[i].equals("shrimp" )) {
				 cost = costOfShrimp;
			}
			if (food[i].equals("Mutton" )) {
				 cost = costOfMutton;
			}
			if (food[i].equals("Lamb" )) {
				cost = costOfLamb;
			}
			
			total = total + cost;
		}
		System.out.println("The total is " + total);
		

	}

}
