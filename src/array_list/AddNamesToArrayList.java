package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNamesToArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> familyName = new ArrayList();
		
		Scanner scr = new Scanner(System.in);

		for(int i = 0; i < 5; i++ ){
			System.out.println("Enter family Name");
			String fname = scr.next();
			familyName.add(fname);	
		}
	
		for (int i = 0; i < 5; i++) {
			System.out.println(familyName.get(i));
		}
		
//		familyName.add("Sanu");
//		familyName.add("Sunkesari");
//		familyName.add("Sabina");
//		familyName.add("Sujan");
//		familyName.add("Renu");	
//		
//		System.out.println(familyName.get(0));
//		System.out.println(familyName.get(1));
//		System.out.println(familyName.get(2));
//		System.out.println(familyName.get(3));
//		System.out.println(familyName.get(4));
//		
	}

}
