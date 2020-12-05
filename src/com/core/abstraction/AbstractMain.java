package com.core.abstraction;

import java.util.Scanner;

public class AbstractMain {

	public static void main(String[] args) {
		
//		Circle c = new Circle();
//		c.calculateArea();
//		
//		Triangle t = new Triangle();
//		t.calculateArea();
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter shape name");

		String shapeName = scr.next(); //circle, rectangle
		
		
//		ShapeTemplate a = new Circle();
//		a.calculateArea();
		

		//Circle object, traingle object
		//Factory function dynamic object generate garne  //new Circle();
		ShapeTemplate st = ShapeFactory.getShapeObject(shapeName);  // = new Rectangle();, new Triangle();
		
		st.calculateArea();
		
		
		scr.close();
		
	}

}
