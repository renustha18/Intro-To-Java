package renus_practice;

import java.util.Scanner;

public class FamilyName {
	
	

	public static void main(String[] args) {
		String[] name = {"Sanu Kaji Shrestha", "SUnkesari Shrestha", "Sabina Shrestha", "Renu Shrestha", "Sujan Shrestha"};
		
//		name[1] = "Sunkesari Bhui";
		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the index");
		int index = scr.nextInt();
		
		System.out.println("Enter new name");
		String newname = scr.next();
		
		name[index]= newname;
		
		
		
		for (int i = 0; i<5; i++) {
			System.out.println(name[i]);
				
		}
		
		
	}

}
