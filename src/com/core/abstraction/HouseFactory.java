package com.core.abstraction;

public class HouseFactory {
	public static House getHouseObject(String style) {
		
		if(style.equalsIgnoreCase("Ranch")) {
			return new RanchHouse(1, "traditional");	
		}
		
		if(style.equalsIgnoreCase("Loft")) {
			return new LoftHouse(5, "modern");	
		}
		
		return null;
		
	}

}
