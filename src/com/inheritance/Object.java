package com.inheritance;

public class Object extends Math{
	public String type;
	public int radius;
	public int length;
	public int breadth;
	public int height;
	public int base;

	public static void main(String[] args) {
		
		Object ob1 = new Object();
		ob1.type = "circle";
		ob1.radius= 5;
		double areaOfC= ob1.areaOfCircle(ob1.radius);
		
		System.out.println("the radius of circle is " + ob1.radius);
		System.out.println("the area of circle is " + areaOfC);
		
		
		Object ob2 = new Object();
		ob2.type = "triangle";
		ob2.base= 5;
		ob2.height= 10;
		double areaOfTriangle  = ob2.areaOfTriangle(ob2.base, ob2.height);
		System.out.println("the area of triangle is " + areaOfTriangle);
		
		Object ob3 = new Object();
		ob3.type = "rectangle";
		ob3.length= 10;
		ob3.breadth = 20;
		int areaOfRectangle = ob3.areaOfRectangle(ob3.length, ob3.breadth);
		System.out.println("the area of rectangle is " + areaOfRectangle );
		
		
		
		
	}

}
