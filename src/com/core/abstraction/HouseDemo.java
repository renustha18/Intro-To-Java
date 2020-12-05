package com.core.abstraction;

import java.util.Scanner;

public class HouseDemo {

	public static void main(String[] args) {
	
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the house style");
		String houseStyle = scr.next();
		
		House houseobj = HouseFactory.getHouseObject(houseStyle);
		
		houseobj.printStory();
		houseobj.printHouseDesign();
	
	}

}
