package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZipcodeToCounty {

	public static void main(String[] args) {
		
//HashMap <Integer(key), String (value) > variable name = new HashMap();
		
		HashMap <Integer, String> zipcodeToCountyMap = new HashMap();
		
		Scanner scr = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the zipcode");
			int zipcode = scr.nextInt();
			System.out.println("Enter the county");
			String county = scr.next();
			
			zipcodeToCountyMap.put(zipcode, county);
		}
		
		
		
		
//		zipcodeToCountyMap.put(68106, "Douglas");
//		zipcodeToCountyMap.put(68501, "Lancaster");
		
		Set<Integer> keys = zipcodeToCountyMap.keySet();
		
		System.out.println("Printing keys=======");
		for(Integer key : keys) {   //for each loop
			System.out.println(key);
		}
		
		System.out.println("Printing values=======");
		Collection<String> values = zipcodeToCountyMap.values();
		for(String value : values ) {
			System.out.println(value);
		}
		
		System.out.println("Printing keys and values=======");
		for(Integer key : keys) { 
			System.out.println(key);
			
			String county = zipcodeToCountyMap.get(key);
			System.out.println(county);
			
		}
		
		System.out.println("Printing keys and values========");
		
		Set<Entry<Integer, String>> key_value_pairs = zipcodeToCountyMap.entrySet();
		for(Map.Entry<Integer, String> key_value_pair : key_value_pairs) {
			System.out.println(key_value_pair.getKey());
			System.out.println(key_value_pair.getValue());
		}
		
		
		
//		String county = zipcodeToCountyMap.get(68106);
//		String county1 = zipcodeToCountyMap.get(68501);
//		
//		System.out.println(county);
//		System.out.println(county1);
		
	
	}

}
