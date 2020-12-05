package com.objects;

import java.util.Scanner;

public class Product {
	
	private String name;
	private double cost;
	private String brand;
	
	public Product() {   //default constructor syntax
		
	}
	
	public Product(String name, double price, String brand) {  //passing 3 parameters
		this.name = name; 
		this.cost = price;
		this.brand = brand;
	}
	
	public void setname(String name) {
		this.name = name; 
	}
	public String getname() {
		return name; 
	}
	
	public void setcost(double cost) {
		this.cost = cost; 
	}
	
	public double getcost() {
		return cost; 
	}
	public void setbrand(String brand) {
		this.brand = brand; 
	}
	public String getbrand() {
		return brand; 
	}
	

	public static void main(String[] args) {
		Product prod[] = new Product[2]; // Product array variable
		prod[0] = new Product(); //instance
		prod[0].setname("denim"); //set name for product 1
		prod[0].setcost(45);
		prod[0].setbrand("buckle");
		
		Scanner  scr = new Scanner(System.in); //console
		
		System.out.println("Enter the name");
		String name = scr.next();
		System.out.println("Enter the cost");
		double cost = scr.nextDouble();
		System.out.println("Enter the brand");
		String brand = scr.next();
		
		
		prod[1] = new Product();
		prod[1].setname(name); // set name for product 2
		prod[1].setcost(cost);
		prod[1].setbrand(brand);
		
		for (int i=0; i<2; i++) {
			System.out.println(prod[i].getname());		//print products name
			System.out.println(prod[i].getcost());
			System.out.println(prod[i].getbrand());
		}
		
	}

}
