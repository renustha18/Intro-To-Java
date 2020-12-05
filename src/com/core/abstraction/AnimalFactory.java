package com.core.abstraction;

public class AnimalFactory {
	
	public static Animal getAnimalObject(String animalType) {
		
		if (animalType.equalsIgnoreCase("Cat")) {
			return new Cat();
		}
		else if (animalType.equalsIgnoreCase("Dog")) {
			return new Dog();
		
		}
		else {
			return null;
		}
	}

}
