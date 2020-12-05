package com.method;

public class MethodDemo {
	// public return_type methodname(parameter)
	public float calculateDivision(int a, int b){	
		return a/b; 
		
	}
	
	// public return_type methodname(parameter)
	public void name(String name) {
		System.out.println("Hello" +name);	
	}
	
	// public return_type methodname(parameter)
	public int findTheBiggestNum(int a, int b) {
		if (a>b) {
			return a;
		}
		else {
			return b;
		}		
	}
	// public return_type methodname(parameter)
	public String yourAge( int age){
		String message = "Your age is";
		return message + age; 
			
	}
	
	public boolean isNewar(String lastName) { // if (cond1 || cond2 ||cond3)
		if("shrestha".equalsIgnoreCase(lastName) || "shakya".equalsIgnoreCase(lastName)|| "maharjan".equalsIgnoreCase(lastName)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		MethodDemo e = new MethodDemo();
		float result = e.calculateDivision(10, 5);
		
		System.out.println(result);
		
		int ans = e.findTheBiggestNum(3, 5);
		System.out.println(ans);
		
		String ans2 =e.yourAge(26);
		System.out.println(ans2);
		
		boolean ans3 = e.isNewar("Shrestha");
		if (ans3== true) {
			System.out.println(" this person is Newar");
		
		}
		else {
			System.out.println(" this person is not Newar");
		}

		
	}

}
