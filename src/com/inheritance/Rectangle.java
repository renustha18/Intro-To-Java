package com.inheritance;

public class Rectangle {
	public int length;
	public int breadth;
	
	public int areaOfRectangle(int a, int b ) {
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.length = 5;
		r.breadth = 10;
		int area = r.areaOfRectangle(r.length, r.breadth);
		System.out.println("The area of rectangle is " + area);
	}

}
