package com.interfaces;

public class Cat implements CatInt{
	
	public String name;
	public String color;
	

	@Override
	public void type() {
		System.out.println( " type is cat ");
		
	}

	@Override
	public void color() {
		System.out.print(" color of cat is "+color);
	
		
		
	} 

	

}
