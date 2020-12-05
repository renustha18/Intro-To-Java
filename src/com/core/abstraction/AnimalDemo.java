package com.core.abstraction;

import java.util.Scanner;
public class AnimalDemo {

	public static void main(String[] args) {
		
//		Cat c = new Cat();
//		c.name = "fluffy";
//		c.color = "white";
//		c.legs = 4;
//		
//		System.out.println(c.name + " says ");
//		c.sound();
//		
//		System.out.println();
//		
//		Dog d = new Dog();
//		d.name = "husky";
//		
//		System.out.println(d.name + " says ");
//		d.sound();
//		
//		
//		Animal a = new Cat();
//		a.color = "black";
//		a.legs = 4;
//		a.sound();
////		a.name= "pinky";  // a is cat with parent animal, it has properties of animal but not cat because cat is child.
//		
//		//Cat c1 = new Animal(); // new Animal c1 cannot be made because new parent cannot be made as parent cannot access child's properties.
//		
//		Animal b = new Dog();
//		b.color = "black";
//		b.legs = 4;
//		b.sound();
//		
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the animal type");
		String animalType = scr.next();  //cat
		
//		AnimalFactory w = new AnimalFactory();
//		Animal a1 = w.getAnimalObject(animalType);
		Animal a1 = AnimalFactory.getAnimalObject(animalType); //= new Cat() 
		a1.sound();
		
		

	}

}
