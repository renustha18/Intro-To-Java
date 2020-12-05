package com.interfaces;

import java.util.Scanner;

public class FlowerDemo {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner (System.in);
		
		
//		System.out.println("Enter flower name ");
//		String flower1 = scr.next();
//		
//		Flower fl1 = FlowerFactory.getFlowerObject(flower1);
//		fl1.printColor();
//	
//		System.out.println("Enter flower name ");
//		String flower2 = scr.next();
//		
//		Flower fl2 = FlowerFactory.getFlowerObject(flower2);
//		fl2.printColor();
//		
//		System.out.println("Enter flower name ");
//		String flower3 = scr.next();
//		
//		Flower fl3 = FlowerFactory.getFlowerObject(flower3);
//		fl3.printColor();
		
		Flower[] fl = new Flower[3];
		
		for(int i = 0; i < 3; i++ ) {
		
			System.out.println("Enter the flower name");
			String flowername = scr.next();	
			
			fl[i] = FlowerFactory.getFlowerObject(flowername);	
		}
		for (int i = 0; i < 3; i++ ) {
			fl[i].printColor();		
		}
		
		
		
		//at first ask the user to enter 3 flower names
		//Based on 3 flower names create 3 objects and store in fl
		//last, print the colors of the flowers
		
	}

}
