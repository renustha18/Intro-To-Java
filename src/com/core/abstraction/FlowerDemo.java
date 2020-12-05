package com.core.abstraction;

import java.util.Scanner;

public class FlowerDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter flower name ");
		String flower = scr.next();
		
		
		Flower fl = FlowerFactory.getFlowerObject(flower);
		
		fl.printColor();
		
		
		

	}

}
