package com.interfaces;

public class Rose implements Flower {
	private String color;
	
	public Rose() {
		
	}

	public Rose(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
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
