package com.core.abstraction;

import java.util.Scanner;

public class Circle extends ShapeTemplate{
	
	float radius;
	

	@Override
	public void calculateArea() { ///how
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter radius");
		radius = scr.nextFloat();
		
		area = (PI*radius*radius);
		System.out.println("Area of the circle" +area);
		
	}
	


	
}
