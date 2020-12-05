package com.objects;

import java.util.Scanner;

public class ProductOverload {
	
	public void product(String name) {
		System.out.println(" The product is " + name );
	}
	
	public void product(int a, int b, int c) {
		System.out.println("The product is " + (a*b*c));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter product name");
		String name = scr.next();
		
		ProductOverload pro = new ProductOverload();
		pro.product(name);
		pro.product(1,2,3);
		
				

	}

}
