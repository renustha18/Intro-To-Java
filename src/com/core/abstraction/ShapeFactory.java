package com.core.abstraction;

public class ShapeFactory {

	public static ShapeTemplate getShapeObject(String shapename) {
		
		if(shapename.equalsIgnoreCase("circle")) {
			return new Circle();
			
		}
		
		else if(shapename.equalsIgnoreCase("Triangle")) {
			return new Triangle();
			
		}
		else if(shapename.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		
		else
		{
			return null;
		}
	}
	
	
}
