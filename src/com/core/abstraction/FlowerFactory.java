package com.core.abstraction;

public class FlowerFactory {
	public static Flower getFlowerObject(String flowername) {
		
		if(flowername.equalsIgnoreCase("rose")) {
			return new Rose("red");
		}
		
		if(flowername.equalsIgnoreCase("sunflower")) {
			return new Sunflower("yellow");
		}
		else {
			return null;
		}
	}

}
