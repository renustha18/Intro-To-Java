package com.core.abstraction;

import java.util.Scanner;

public class Cuboid extends Dimension {
	 public float length, breadth, height, volume;  //1000

	@Override
	public void printVolume() {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter length");
		length = scr.nextFloat();
		
		System.out.println("Enter breadth");
		breadth = scr.nextFloat();
		
		System.out.println("Enter height");
		height = scr.nextFloat();
		
		this.volume = (length *breadth *height);  //1000
		
		System.out.println(this.volume);
	}
	
	@Override
	public float calculateVolume() {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter length");
		length = scr.nextFloat();
		
		System.out.println("Enter breadth");
		breadth = scr.nextFloat();
		
		System.out.println("Enter height");
		height = scr.nextFloat();
		
		float volume = (length *breadth *height);  //1000
		
		return volume;  //1000
		
		
		
		
		
	}
	
	
	
	

}
