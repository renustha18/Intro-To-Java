package one_D_array;

import java.util.Scanner;

public class printTheNmaesOfTheFamilyMembers {

	public static void main(String[] args) {
		Scanner  scr = new Scanner(System.in);
		System.out.println("Enter family size");
		int size = scr.nextInt();
		
		String[] familyNames = new String [size];
		
		for(int i = 0; i < size; i++) {
			
			System.out.println("Enter family name");
			familyNames[i]= scr.next();
			
		}
		
		System.out.println("Family names are ");
		
		for(int i= 0; i< size; i++) {
			System.out.println(familyNames[i]);
		}
		
	}

}
