package com.core.abstraction;

import java.util.Scanner;

public class sphere extends Dimension {
	public float radius;
	public final float PI = 3.14f;
	
	
	@Override
	public void printVolume() {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter radius");
		radius = scr.nextFloat();
		
		float volume = (4/3*PI*radius*radius*radius);
		System.out.print(volume);
	}
	
	
	@Override
	public float calculateVolume() {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter radius");
		radius = scr.nextFloat();
		
		float volume = (4/3*PI*radius*radius*radius);
		return volume;
		
	
		
	}
	

}
