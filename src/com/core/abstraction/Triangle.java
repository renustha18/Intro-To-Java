package com.core.abstraction;

import java.util.Scanner;

public class Triangle extends ShapeTemplate{
	float base, height;
	

	@Override
	public void calculateArea() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter base and height");
		base = scr.nextFloat();
		height = scr.nextFloat();
		
		area = (base*height)/2;
		
		System.out.println("Area of the triangle is" +area);
		
		
	}

	
}
