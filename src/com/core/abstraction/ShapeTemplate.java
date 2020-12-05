package com.core.abstraction;

public abstract class ShapeTemplate {  //main reason for abstract class is that it should not be instantiated
										//eg: ShapeTemplate s = new ShapeTemplate() is not possible.

	float area; //float variable properties
	final float PI = 3.14f;   //float constant properties
	
	public abstract void calculateArea(); //abstract method properties, What
		

	
	
	
	
}
