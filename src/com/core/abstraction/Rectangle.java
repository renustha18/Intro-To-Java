package com.core.abstraction;

import java.util.Scanner;

public class Rectangle extends ShapeTemplate{
	
	 public float length, breadth;
	

	@Override
	public void calculateArea() {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter length");
		length = scr.nextFloat();
		
		System.out.println("Enter breadth");
		breadth = scr.nextFloat();
		
		area = (length * breadth);
		System.out.println("Area of the rectangle" +area);
		
	}
	


	
}
