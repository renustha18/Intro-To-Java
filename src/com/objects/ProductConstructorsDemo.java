package com.objects;

public class ProductConstructorsDemo {

	public static void main(String[] args) {
		
		Product prd = new Product();
		prd.setname("tshirt");
		prd.setcost(35);
		prd.setbrand("nike");
		
		Product prd1 = new Product("tshirt", 35, "nike");
		Product prd2 = new Product ("denim", 50, "coverse");
		
	
		
		System.out.println(prd1.getname());
		System.out.println(prd1.getcost());
		System.out.println(prd1.getbrand());
		
		prd1.setcost(25); 
		System.out.println("The new cost is " + prd1.getcost());
		
		System.out.println(prd2.getname());
		System.out.println(prd2.getcost());
		System.out.println(prd2.getbrand());
		
		prd2.setbrand("UM");
		System.out.println("The new brand is " + prd2.getbrand());

	}

}
