package com.objects;

public class MethodOverload {
	
	void input(String value) {
		System.out.println("Input is String");
	}
	
	void input(int value) {
		System.out.println("Input is integer");	
	}
	void input(float value) {
		System.out.println("Input is float");
	}
	void input(double value) {
		System.out.println("Input is double");
	}
	void input(long value) {
		System.out.println("Input is long");
	}
	void add(int a, float b) {
		System.out.println("sum of int and float is " +(a+b));
	}
	void add(float a, int b) {
		System.out.println("sum of float and int is " +(a+b));
	}
	public static void main(String[] args) {
	
			MethodOverload obj = new MethodOverload();
			obj.add(10.2f, 5);
			
			obj.add(5, 15.3f);
			
			//obj.add(4, 5);
			

	}

}
