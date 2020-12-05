package hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {

	public static void main(String[] args) {
		
		HashMap <Long, String> contactNumberToName = new HashMap();
		
		Scanner scr = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter contact number");
			long contactNumber = scr.nextLong();
			System.out.println("Enter name");
			String name = scr.next();
			
			
			contactNumberToName.put(contactNumber, name);
		}
		
		System.out.print("=======Printing contact number and name========\n");
		Set<Long> keys = contactNumberToName.keySet();
		
		for(Long key : keys) {
			if (key % 2 == 0) {
				System.out.println(key);
				
				String contactName = contactNumberToName.get(key);
				System.out.println(contactName);
			}
		}
	
	}

}
