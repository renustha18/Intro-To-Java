package com.core.abstraction;

public class Rose extends Flower{
	
	private String color;
	
	public Rose() {
	}

	public Rose(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void printColor() {
		String color = this.color;
		
		System.out.println(color);
	}
	
	

}
